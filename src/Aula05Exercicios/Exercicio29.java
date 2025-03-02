package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio29 {
    /* Ler um vetor A com 20 elementos. Construir dois vetores B e C,
    sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; // impares

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um numero para a posição A " + i);
            vetorA[i] = scan.nextInt();
        }

        int posicaoB = 0;
        int posicaoC = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) { // par
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            } else { // impar
                vetorC[posicaoC] = vetorA[i];
                posicaoC++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B (Pares) = ");
        for (int i = 0; i < posicaoB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C (Impares) = ");
        for (int i = 0; i < posicaoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
