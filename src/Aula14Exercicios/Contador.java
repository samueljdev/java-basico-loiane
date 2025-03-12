package Aula14Exercicios;

public class Contador {
    private static int conte;

    public Contador() {
        conte++;
    }

    public static void incrementar() {
        conte++;
    }

    public static void zerar() {
        conte = 0;
    }

    public static int obterValorContador() {
        return conte;
    }

    public void imprimirValorStatico(){
        System.out.println(Contador.obterValorContador());
    }
}
