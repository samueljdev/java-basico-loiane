package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    /* Faça um Programa que converta metros para centímetros*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();

        //1m = 100 cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");
    }
}
