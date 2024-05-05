class Punto3D {
    private double x;
    private double y;
    private double z;

    // aqui voy a poner el constructor sin parámetros
    public Punto3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    //aqui ya esta el constructor con parametros
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // la copia del constructor
    public Punto3D(Punto3D otro) {
        this.x = otro.x;
        this.y = otro.y;
        this.z = otro.z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // formulas y claculo de la distancia
    public double distancia(Punto3D otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        double dz = this.z - otro.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class ejercicio7 {
    public static void main(String[] args) {
        Punto3D[] puntos = new Punto3D[10];

        // Inicializa los 10 puntos con valores aleatorios
        for (int i = 0; i < 10; i++) {
            double x = Math.random() * 10;
            double y = Math.random() * 10;
            double z = Math.random() * 10;
            puntos[i] = new Punto3D(x, y, z);
        }

        double menorDistancia = Double.MAX_VALUE;

        // aqui ya calcula la distancia mas corta para todos los puntos
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                double distancia = puntos[i].distancia(puntos[j]);
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                }
            }
        }

        System.out.println("La distancia mas corta entre los puntos es: " + menorDistancia);
    }
}
