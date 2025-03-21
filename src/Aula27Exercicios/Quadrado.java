package Aula27Exercicios;

public class Quadrado extends Figura2D implements DimensaoSuperficial {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public double calcularArea() {
//        return lado * lado;
        return Math.pow(lado, 2);
    }
}
