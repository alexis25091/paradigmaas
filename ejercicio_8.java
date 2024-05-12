import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class LecturaNumeros extends BufferedReader {

    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    public LecturaNumeros(Reader r) {
        super(r);
    }

    public int readInt() throws IOException {
        return Integer.parseInt(this.readLine());
    }

    public int readInt(String mensaje) throws IOException {
        System.out.println(mensaje);
        return this.readInt();
    }

    public Integer readInteger() throws IOException {
        return this.readInt();
    }

    public double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    public double readDouble(String mensaje) throws IOException {
        System.out.println(mensaje);
        return this.readDouble();
    }
}

public class ejercicio_8 {
    public static void main(String[] args) {
        try {
            LecturaNumeros lector = new LecturaNumeros();

            System.out.println("Introduce dos números enteros:");
            int num1 = lector.readInt();
            int num2 = lector.readInt();

            System.out.println("Introduce un número entero como Integer:");
            Integer numInteger = lector.readInteger();

            System.out.println("Introduce un número decimal:");
            double numDouble = lector.readDouble();

            System.out.println("Introduce un número decimal como Double:");
            double numDoubleObj = lector.readDouble();

            System.out.println("Números introducidos:");
            System.out.println("Número 1: " + num1);
            System.out.println("Número 2: " + num2);
            System.out.println("Número Integer: " + numInteger);
            System.out.println("Número Double: " + numDouble);
            System.out.println("Número Double como objeto: " + numDoubleObj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
