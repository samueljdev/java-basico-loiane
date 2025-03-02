package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    /* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
    o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        int impar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }

        int par = vetorA.length - impar;
        double porcentagemPar = (double) (par * 100) / vetorA.length;
        double porcentagemImpar = 100 - porcentagemPar;

        System.out.println("Porcetagem dos impar = " + porcentagemPar);
        System.out.println("orcetagem dos par= " + porcentagemImpar);
    }
}
