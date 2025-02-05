package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio30 {
    /* Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
    digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar
    em 10, o valor inicial e final devem ser informados também pelo usuário,
    conforme exemplo abaixo:
    Montar a tabuada de: 5
    Começar por: 4
    Terminar em: 7
    Vou montar a tabuada de 5 começando em 4 e terminando em 7:
    5 X 4 = 20
    5 X 5 = 25
    5 X 6 = 30
    5 X 7 = 35 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número para gerar a tabuada: ");
        int numero = scan.nextInt();

        boolean invalido = true;
        int numFinal, numInicio;

        do {
            System.out.println("Entre com o início da tabuada");
            numInicio = scan.nextInt();

            System.out.println("Entre como final da tabuada");
            numFinal = scan.nextInt();

            if (numFinal > numInicio) {
                invalido = false;
            }

        } while (invalido);

        System.out.println("Tabuada de " + numero + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();

        for (int i = numInicio; i <= numFinal; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
