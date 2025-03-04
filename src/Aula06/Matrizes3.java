package Aula06;

import java.util.Scanner;

public class Matrizes3 {
    /* Fazendo matrizes Irregulares */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o números de pessoas que serão entrevistadas: ");
        int numeroEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            int quantidadeFilhos = scan.nextInt();

            nomesFilhos[i] = new String[quantidadeFilhos];
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j + 1));
                nomesFilhos[i][j] = scan.next();
            }
        }
        System.out.println();

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
