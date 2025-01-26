package Aula01;

public class _02TiposPrimitivos {
    public static void main(String[] args) {
        // variaveis tipo boolean
        char o = 0;
        char i = 0;
        char interrogacao = 0X003F; // valor '?'
        System.out.println(""+o+i+interrogacao);
        System.out.println("----------------------------------------");

        // variaveis do tipo lógico ou booleano
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("O valor de verdadeiro é " + verdadeiro);
        System.out.println("O valor de false é " + falso);
        System.out.println("----------------------------------------");

        // variaveis inteiras
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;
        System.out.println("Valor variável idade01 = " + idade01);
        System.out.println("Valor variável idade02 = " + idade02);
        System.out.println("Valor variável idade03 = " + idade03);
        System.out.println("Valor variável idade04 = " + idade04);
        System.out.println("----------------------------------------");

        // variaveis de ponto flutuante
        double valorPassagem = 2.90;
        float valorTomate = 3.95F;
        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do tomate = " + valorTomate);

    }
}
