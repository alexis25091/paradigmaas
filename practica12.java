import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) throws SaldoCuentaInsuficiente {
        if (monto > saldo) {
            throw new SaldoCuentaInsuficiente("Saldo insuficiente en la cuenta");
        }
        saldo -= monto;
    }
}

class CajeroAutomatico {
    private Map<String, Cuenta> cuentas;
    private double saldoEfectivo;

    public CajeroAutomatico() {
        cuentas = new HashMap<>();
        saldoEfectivo = 100000;
        // Agregar algunas cuentas de ejemplo
        cuentas.put("123456", new Cuenta("Juan Pérez", 5000));
        cuentas.put("789012", new Cuenta("María García", 8000));
    }

    public void autenticarCuentahabiente(String numeroCuenta) {
        if (cuentas.containsKey(numeroCuenta)) {
            System.out.println("Autenticación exitosa");
            operacionesCuenta(numeroCuenta);
        } else {
            System.out.println("Número de cuenta no válido");
        }
    }

    private void operacionesCuenta(String numeroCuenta) {
        Cuenta cuenta = cuentas.get(numeroCuenta);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOperaciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depósito en efectivo a cuenta propia");
            System.out.println("3. Depósito en efectivo a otra cuenta");
            System.out.println("4. Transferencia a otra cuenta");
            System.out.println("5. Retiro de efectivo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    cuenta.depositar(montoDeposito);
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta destino: ");
                    String cuentaDestino = scanner.next();
                    if (cuentas.containsKey(cuentaDestino)) {
                        System.out.print("Ingrese el monto a depositar: ");
                        double monto = scanner.nextDouble();
                        if (monto <= saldoEfectivo) {
                            cuentas.get(cuentaDestino).depositar(monto);
                            saldoEfectivo -= monto;
                            System.out.println("Depósito exitoso a la cuenta " + cuentaDestino);
                        } else {
                            System.out.println("Saldo de efectivo insuficiente en el cajero");
                        }
                    } else {
                        System.out.println("Número de cuenta destino no válido");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número de cuenta destino: ");
                    String cuentaTransferencia = scanner.next();
                    if (cuentas.containsKey(cuentaTransferencia)) {
                        System.out.print("Ingrese el monto a transferir: ");
                        double montoTransferencia = scanner.nextDouble();
                        try {
                            cuenta.retirar(montoTransferencia);
                            cuentas.get(cuentaTransferencia).depositar(montoTransferencia);
                            System.out.println("Transferencia exitosa");
                        } catch (SaldoCuentaInsuficiente e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Número de cuenta destino no válido");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    try {
                        if (montoRetiro <= saldoEfectivo) {
                            cuenta.retirar(montoRetiro);
                            saldoEfectivo -= montoRetiro;
                            System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                        } else {
                            throw new SaldoEfectivoInsuficiente("Saldo de efectivo insuficiente en el cajero");
                        }
                    } catch (SaldoCuentaInsuficiente | SaldoEfectivoInsuficiente e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el cajero automático");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

class SaldoCuentaInsuficiente extends Exception {
    public SaldoCuentaInsuficiente(String mensaje) {
        super(mensaje);
    }
}

class SaldoEfectivoInsuficiente extends Exception {
    public SaldoEfectivoInsuficiente(String mensaje) {
        super(mensaje);
    }
}

public class practica12 {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        cajero.autenticarCuentahabiente(numeroCuenta);
    }
}
