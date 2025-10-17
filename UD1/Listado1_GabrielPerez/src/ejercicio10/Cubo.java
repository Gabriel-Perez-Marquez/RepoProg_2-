package ejercicio10;

public class Cubo extends Figura {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}