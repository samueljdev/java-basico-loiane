package Aula15Exercicios;

public class Exercicio01 {
    /* Escreva um metodo recursivo e estático que calcule e retorne o N‐ésimo termo da sequência Fibonacci.
    Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89... */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Calculadora.calcularFibonacci(i) + " ");
        }
    }
}
