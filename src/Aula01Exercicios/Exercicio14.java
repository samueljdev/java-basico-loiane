package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    /* Faça um programa para uma loja de tintas.
    O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que acobertura da tinta é de 1 litro para cada 3 metros quadrados
    E que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
    Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a área a ser pintada em m2: ");
        double tamanhoAreaEmMetros = scan.nextDouble();

        double lataLitrosTinta = 18;
        double valorLataTinta = 80;

        double areaPintadaPorLata = (tamanhoAreaEmMetros / lataLitrosTinta) / 3;
        double quantidadeHaComprarDeLatas = valorLataTinta * areaPintadaPorLata;

        System.out.println("Valor de uma unidade Lata da Tinta: " + valorLataTinta + " R$");

        System.out.println("O Valor da área ser pintada: " + quantidadeHaComprarDeLatas);
    }
}
