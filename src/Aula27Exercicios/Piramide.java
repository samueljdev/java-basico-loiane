package Aula27Exercicios;

public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numeroPoligonoBase;
    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumeroPoligonoBase() {
        return numeroPoligonoBase;
    }

    public void setNumeroPoligonoBase(int numeroPoligonoBase) {
        this.numeroPoligonoBase = numeroPoligonoBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "altura=" + altura +
                ", arestaBase=" + arestaBase +
                ", apotema=" + apotema +
                ", numeroPoligonoBase=" + numeroPoligonoBase +
                ", base=" + base +
                '}';
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return ((numeroPoligonoBase * (arestaBase * apotema)) / 2) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }
}
