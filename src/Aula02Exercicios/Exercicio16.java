package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    /* Faça um programa que calcule as raízes de uma equação do segundo grau,
     na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências,
     informando ao usuário nas seguintes situações:
     a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau
     e o programa não deve fazer pedir os demais valores, sendo encerrado;
     b. Se o delta calculado for negativo, a equação não possui raizes reais.
     Informe ao usuário e encerre o programa;
     c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
     d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor de a: ");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é equação de segundo grau");
        } else {

            System.out.print("Entre com o valor de b: ");
            int b = scan.nextInt();

            System.out.print("Entre com o valor de c: ");
            int c = scan.nextInt();

            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("detla negativo");
            } else {
                System.out.println("delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
