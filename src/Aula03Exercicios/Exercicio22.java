package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    /* Faça um programa que calcule o valor total investido por um colecionador
     em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário
     deverá informar a quantidade de CDs e o valor para em cada um */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o número de CDs: ");
        int cds = scan.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= cds; i++) {
            System.out.println("Informe o valor do cd " + i);
            preco = scan.nextDouble();
            soma += preco;
        }

        double media = soma / cds;

        System.out.println("Média gasta com cada CD: " + media);
    }
}
