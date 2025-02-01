package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    /* Faça um Programa que peça dois números e imprima o maior deles */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        if (numero1 > num2) {
            System.out.println("O número 1 é maior: " + numero1);
        } else {
            System.out.println("O número 1 é maior: " + num2);
        }
    }
}
