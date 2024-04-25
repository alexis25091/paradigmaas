public class rectangulo {
    private String color;
    private double base;
    private double altura;

    public rectangulo(String color, double base, double altura) {
        this.color = color;
        this.base = base;
        this.altura = altura;
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
        return base * altura;
    }

    private double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
