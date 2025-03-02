package Aula05Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    /* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
    e escreva a quantidade de elementos armazenados neste vetor que são pares */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.println();
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números pares = " + qtdPares);
    }
}
