package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    /* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    Escreva um programa que determine escreva a quantidade de pessoas que possuem
    idade superior a 35 anos */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o idade da pessoa na posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        int quantidade = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                quantidade++;
            }
        }

        System.out.print("VetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Qdt pessoas idade > 35: " + quantidade);
    }
}
