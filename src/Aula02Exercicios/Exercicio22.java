package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    /* Uma fruteira está vendendo frutas com a seguinte tabela de preços:
    Até 5 Kg Acima de 5 Kg
    Morango R$ 2,50 por Kg R$ 2,20 por Kg
    Maçã R$ 1,80 por Kg R$ 1,50 por Kg
    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
    ainda um desconto de 10% sobre este total.
    Escreva um algoritmo para ler a quantidade (em Kg) de morangos
    e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade (kg) de morango: ");
        double quantidadeMorango = scan.nextDouble();

        System.out.print("Entre com a quantidade (kg) de maça: ");
        double quantidadeMacas = scan.nextDouble();

        double precoKgMorango = 0;
        if (quantidadeMorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (quantidadeMacas <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = quantidadeMorango * precoKgMorango;
        double precoTotalMaca = quantidadeMacas * precoKgMaca;

        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if ((quantidadeMorango + quantidadeMacas > 8) || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        // debbuger precoTotal
        System.out.println("Preço preço do Morango = " + precoTotalMorango);
        System.out.println("Preço preço da Maçã = " + precoTotalMaca);
        System.out.println("Preço total sem desconto = " + precoParcial);
        System.out.println("Preço total com desconto = " + precoTotal);
    }
}
