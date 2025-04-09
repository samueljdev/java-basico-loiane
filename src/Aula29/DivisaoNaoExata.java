package Aula29;

public class DivisaoNaoExata extends Exception {
    private int numero;
    private int denominador;

    public DivisaoNaoExata(int numero, int denominador) {
        super();
        this.numero = numero;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + this.numero + "/" + this.denominador + " não é um inteiro!";
    }
}
