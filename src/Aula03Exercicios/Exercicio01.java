package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    /* Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.print("Entre com uma nota: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou nota valida: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);
    }
}
