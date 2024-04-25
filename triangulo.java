public class triangulo {
    private String color;
    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(String color, double lado1, double lado2, double lado3) {
        this.color = color;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    private double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
