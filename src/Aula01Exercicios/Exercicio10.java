package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    /*  Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
    que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
