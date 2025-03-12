package Aula14Exercicios;

public class Exercicio01 {
    /* Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe
    for instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa
    para testar essa classe */

    static void imprimirValor() {
        System.out.println(Contador.obterValorContador());
    }

    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        System.out.println("-------------------------");
        Contador contador1 = new Contador();
        contador1.imprimirValorStatico();

        Contador contador2 = new Contador();
        contador2.imprimirValorStatico();

        Contador contador3 = new Contador();
        contador3.imprimirValorStatico();
    }
}
