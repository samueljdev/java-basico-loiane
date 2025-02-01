package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    /* Faça um Programa que leia três números e mostre-os em ordem decrescente*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Entre com terceiro número: ");
        int numero3 = scan.nextInt();

        if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
            //num1 é menor
            //num3 é maior
            // num1 < num2 < num3
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);

        } else if (numero1 <= numero3 && numero3 <= numero2) {
            //num1 é menor
            //num2 é maior
            // num1 < num3 < num2
            System.out.println(numero2 + " - " + numero3 + " - " + numero1);

        } else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
            //num2 é menor
            //num3 é maior
            // num2 < num1 < num3
            System.out.println(numero3 + " - " + numero1 + " - " + numero2);

        } else if (numero2 <= numero3 && numero3 <= numero1) {
            //num2 é menor
            //num1 é maior
            // num2 < num3 < num1
            System.out.println(numero1 + " - " + numero3 + " - " + numero2);

        } else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
            //num3 é menor
            //num2 é maior
            // num3 < num1 < num2
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);

        } else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
            //num3 é menor
            //num1 é maior
            // num3 < num2 < num1
            System.out.println(numero1 + " - " + numero2 + " - " + numero3);
        }
    }
}
