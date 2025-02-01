package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    /* Faça um Programa que peça um número correspondente a um determinado ano
    e em seguida informe se este ano é ou não bissexto */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o ano: ");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("é bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }
}
