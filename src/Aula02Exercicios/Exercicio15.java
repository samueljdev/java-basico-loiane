package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    /* Faça um Programa que peça os 3 lados de um triângulo.
    O programa deverá informar se os valores podem ser um triângulo.
    Indique, caso os lados formem um triângulo,
    Se o mesmo é: equilátero, isósceles ou escaleno.
    Dicas:
    Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    Triângulo Equilátero: três lados iguais; o Triângulo Isósceles: quaisquer dois lados iguais;
    Triângulo Escaleno: três lados diferentes; */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o lado 1: ");
        int lado1 = scan.nextInt();

        System.out.print("Entre com o lado 2: ");
        int lado2 = scan.nextInt();

        System.out.print("Entre com o lado 3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            if (lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("não forma um triângulo");
        }
    }
}
