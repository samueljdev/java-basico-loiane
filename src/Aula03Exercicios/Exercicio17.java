package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    /* Faça um programa que calcule o fatorial de um número inteiro
    fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.println(num + "! = ");

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }

        System.out.println("Resultado: " + fatorial);
    }
}
