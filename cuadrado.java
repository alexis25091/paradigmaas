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

    public double getArea() {
        return calcularArea();
    }

    public double getPerimetro() {
        return calcularPerimetro();
    }

    private double calcularArea() {
        return lado * lado;
    }

    private double calcularPerimetro() {
        return 4 * lado;
    }
}
