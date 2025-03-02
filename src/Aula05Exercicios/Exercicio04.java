package Aula05Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    /* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
    sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja:
    B[i] = sqrt(A[i]) */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
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
    }
}
