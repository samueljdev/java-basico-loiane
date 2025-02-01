package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    /* Faça um programa que pergunte o preço de três produtos e informe
    qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com primeiro preço do produto 1: ");
        double preco1 = scan.nextDouble();

        System.out.print("Entre com segundo preço do produto 2: ");
        double preco2 = scan.nextDouble();

        System.out.print("Entre com terceiro preço do produto 3: ");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2) {
            System.out.println("Compre o produto 3");
        }
    }
}
