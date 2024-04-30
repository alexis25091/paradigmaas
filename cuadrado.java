public class cuadrado {
    private String color;
    private double lado;

    public cuadrado(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return calcularArea();
    }

    public double getPerimetro() {
        return calcularPerimetro();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double calcularArea() {
        return lado * lado;
    }

    private double calcularPerimetro() {
        return 4 * lado;
    }

    public static void main(String[] args) {
        // Crear un cuadrado
        cuadrado miCuadrado = new cuadrado("verde", 5.0);
        miCuadrado.setColor("amarillo");
        miCuadrado.setLado(7.0);
        System.out.println("Información del cuadrado:");
        System.out.println("Color: " + miCuadrado.getColor());
        System.out.println("Lado: " + miCuadrado.getLado());
        System.out.println("Área: " + miCuadrado.getArea());
        System.out.println("Perímetro: " + miCuadrado.getPerimetro());
    }
}
