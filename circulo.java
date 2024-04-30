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

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return calcularArea();
    }

    public double getPerimetro() {
        return calcularPerimetro();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    private double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        circulo miCirculo = new circulo("rojo", 5.0);
        miCirculo.setColor("azul");
        miCirculo.setRadio(7.0);
        System.out.println("Información del círculo:");
        System.out.println("Color: " + miCirculo.getColor());
        System.out.println("Radio: " + miCirculo.getRadio());
        System.out.println("Área: " + miCirculo.getArea());
        System.out.println("Perímetro: " + miCirculo.getPerimetro());
    }
}
