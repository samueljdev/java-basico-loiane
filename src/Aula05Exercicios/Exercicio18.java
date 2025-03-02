package Aula05Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    /* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorIdades = new int[10];

        for (int i = 0; i < vetorIdades.length; i++) {
            System.out.println("Entre com o idade da pessoa na posição VetorA: " + i);
            vetorIdades[i] = scan.nextInt();
        }

        int maiorIdade = vetorIdades[0];
        int indexMaior = 0;
        int menorIdade = vetorIdades[0];
        int indexMenor = 0;

        for (int i = 1; i < vetorIdades.length; i++) {
            if (vetorIdades[i] > maiorIdade) {
                maiorIdade = vetorIdades[i];
                indexMaior = i;
            } else if (vetorIdades[i] < menorIdade) {
                menorIdade = vetorIdades[i];
                indexMenor = i;
            }
        }

        System.out.print("VetorA = ");
        for (int i = 0; i < vetorIdades.length; i++) {
            System.out.print(vetorIdades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Indice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Indice maior idade: " + indexMaior);
    }
}
