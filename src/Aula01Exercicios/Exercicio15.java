package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    /* Faça um programa para uma loja de tintas.
    O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
    E que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    Ao comprar apenas latas de 18 litros; Ao comprar apenas galões de 3,6 litros */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a área a ser pintada em m2: ");
        double tamanhoAreaEmMetros = scan.nextDouble();

        double lataLitrosTinta = 18;
        double valorLataTinta = 80;
        double galaoLitrosTinta = 3.6;
        double valorgalaoLitro = 25;

        double areaPintadaPorLata = (tamanhoAreaEmMetros / lataLitrosTinta) / 6;
        double quantidadeHaComprarDeLatas = valorLataTinta * areaPintadaPorLata;

        double areaPintadaPorGalao = (tamanhoAreaEmMetros / galaoLitrosTinta) / 6;
        double quantidadeHaComprarDeGalao = valorgalaoLitro * areaPintadaPorGalao;

        System.out.println("Valor de uma unidade de lata 18L: " + valorLataTinta + " R$");
        System.out.println("O Valor da área ser pintada com lata de 18L: " + quantidadeHaComprarDeLatas);
        System.out.println("------------------------------------------------------");
        System.out.println("Valor de uma unidade de Galão 3.6L: " + valorgalaoLitro + " R$");
        System.out.println("O Valor da área ser pintada com Galão 3.6L: " + quantidadeHaComprarDeGalao);
    }
}
