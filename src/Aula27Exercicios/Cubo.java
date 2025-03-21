package Aula27Exercicios;

public class Cubo extends Figura3D {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public double calcularArea() {
//        return 6 * (lado * lado);
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolume() {
//        return lado * lado * lado;
        return Math.pow(lado, 3);
    }
}
