package Aula14Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    /* Escreva um metodo para calcular factorial de um número na classe Calculadora do exercício anterior. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Entre com um número positivo: ");
            numero = scan.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido, entre novamente");
            }
        } while (numero < 0);

        System.out.println("Fatoria do numero digitado: " + Calculadora.fatorial(numero));
    }
}
