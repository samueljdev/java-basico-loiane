package Aula05Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    /* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
    onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
    C[i] = A[i] / float(B[i]).*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        float[] vetorC = new float[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor da posição VetorB: " + i);
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = (float) vetorA[i] / vetorB[i];
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println();
        System.out.println("Vetor de A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(" " + df.format(vetorA[i]));
        }

        System.out.println();
        System.out.println("Vetor de B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(" " + df.format(vetorB[i]));
        }

        System.out.println();
        System.out.println("Vetor de C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(" " + df.format(vetorC[i]));
        }
    }
}
