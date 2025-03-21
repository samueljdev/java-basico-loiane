package Aula27Exercicios;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public double calcularArea() {
        return Math.pow(raio, 2) * Math.PI;
    }
}
