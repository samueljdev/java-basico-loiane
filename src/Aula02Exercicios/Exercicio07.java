package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    /* Faça um Programa que leia três números e mostre o maior e o menor deles */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Entre com terceiro número: ");
        int numero3 = scan.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("num1 é maior: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("num2 é maior: " + numero2);
        } else if (numero3 >= numero1 && numero3 >= numero2) {
            System.out.println("num3 é maior: " + numero3);
        }

        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("num1 é menor: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("num2 é menor: " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2) {
            System.out.println("num3 é menor: " + numero3);
        }
    }
}
