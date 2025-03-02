package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    /* Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
    a) a soma de elementos armazenados neste vetor que são inferiores a 15;
    b) a quantidade de elementos armazenados no vetor que são iguais a 15;
    c) a média dos elementos armazenados no vetor que são superiores a 15 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        int somarMenor15 = 0;
        int igual15 = 0;
        float somaMaior15 = 0;
        float qdtmaior15 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somarMenor15 += vetorA[i];
            } else if (vetorA[i] == 15) {
                igual15++;
            } else {
                qdtmaior15++;
                somaMaior15 += vetorA[i];
            }
        }

        System.out.print("VetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Qdt números == 15: " + igual15);
        System.out.println("Somar números < 15: " + somarMenor15);
        System.out.println("Média números > 15: " + (somaMaior15 / qdtmaior15));
    }
}
