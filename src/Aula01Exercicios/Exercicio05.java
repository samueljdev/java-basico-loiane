package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    /*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();

        //area = lado * lado
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}
