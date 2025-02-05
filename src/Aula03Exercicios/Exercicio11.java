package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    /* Altere o programa anterior para mostrar no final a soma dos números */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
