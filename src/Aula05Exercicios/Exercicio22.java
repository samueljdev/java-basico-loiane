package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    /* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos"
     os elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de
     repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão: utilize uma
     variável do tipo flag para atingir este propósito */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um numero para a posição " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                break;
            }
        }
    }
}
