package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio21 {
    /* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
     sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar
     um programa que determine o percentual de números 0's e 1's existentes no vetor A */
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int contador0 = 0;
        int contador1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                contador0++;
            }
            if (vetorA[i] == 1) {
                contador1++;
            }
        }

        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;
        double porcentagem0 = (double) (contador0 * 100) / vetorA.length;
        double porcentagem1 = (double) (contador1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Porcentagem de 0 : " + porcentagem0);
        System.out.println("Porcentagem de 1 : " + porcentagem1);
    }
}

