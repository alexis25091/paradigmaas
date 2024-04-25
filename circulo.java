public class circulo {
    private String color;
    private double radio;

    public circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
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
        return Math.PI * Math.pow(radio, 2);
    }

    private double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
