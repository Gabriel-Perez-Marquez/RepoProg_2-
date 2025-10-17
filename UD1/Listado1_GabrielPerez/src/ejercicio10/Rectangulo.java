package ejercicio10;

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularVolumen() {
        return 0; // No tiene volumen
    }
}
