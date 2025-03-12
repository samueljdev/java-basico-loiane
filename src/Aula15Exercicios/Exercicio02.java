package Aula15Exercicios;

public class Exercicio02 {
    /* Escreva um metodo recursivo e estático que receba um número inteiro positivo N e calcule
    o somatório dos números de 1 a N */
    public static void main(String[] args) {
        // somatório direto
        System.out.println(Somatorio.somatorio(5));
        System.out.println("--------------------------");

        // fazendo um for
        for (int i = 1; i <= 5; i++) {
            System.out.print(Somatorio.somatorio(i) + " ");
        }
    }
}
