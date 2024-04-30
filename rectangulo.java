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

    public void setColor(String color) {
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public static void main(String[] args) {
        // Crear un rectángulo
        rectangulo miRectangulo = new rectangulo("azul", 3.0, 5.0);
        miRectangulo.setColor("verde");
        miRectangulo.setBase(4.0);
        miRectangulo.setAltura(6.0);
        System.out.println("Información del rectángulo:");
        System.out.println("Color: " + miRectangulo.getColor());
        System.out.println("Base: " + miRectangulo.getBase());
        System.out.println("Altura: " + miRectangulo.getAltura());
        System.out.println("Área: " + miRectangulo.getArea());
        System.out.println("Perímetro: " + miRectangulo.getPerimetro());
    }
}
