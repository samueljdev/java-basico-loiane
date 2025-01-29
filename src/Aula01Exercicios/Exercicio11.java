package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    /* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
    calcule seu peso ideal, utilizando as seguintes fórmulas: Para homens: (72.7*h) - 58
    a. Para mulheres: (62.1*h) - 44.7 (h = altura)
    b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a altura Homem: ");
        double alturaHomen = scan.nextDouble();

        System.out.print("Entre com a altura Mulher: ");
        double alturaMulher = scan.nextDouble();

        double pesoIdealHomem = (72.7 * alturaHomen) - 58;
        double pesoIdealMulher = (62.1 * alturaMulher) - 44.7;

        System.out.println("O peso ideal do Homem é: " + pesoIdealHomem);
        System.out.println("O peso ideal do Homem é: " + pesoIdealMulher);
    }
}
