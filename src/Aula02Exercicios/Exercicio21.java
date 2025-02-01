package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio21 {
    /* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
    . Álcool:
    a. até 20 litros, desconto de 3% por litro
    b. acima de 20 litros, desconto de 5% por litro
    Gasolina:
    c. até 20 litros, desconto de 4% por litro
    d. acima de 20 litros, desconto de 6% por litro
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
    (codificado da seguinte forma: A-álcool, Ggasolina),
    calcule e imprima o valor a ser pago pelo cliente sabendo-se que
    o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a qtd de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.print("Entre com o tipo de combustível G-(Gasolina) e A-(Álcool): ");
        String tipo = scan.next();

        double precoGasolina = 2.5;
        double precoAlcool = 1.9;
        int percentualDesconto = 0;
        double subTotal = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")) {

            if (litros <= 20) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            subTotal = litros * precoAlcool;

        } else if (tipo.equalsIgnoreCase("g")) {

            if (litros <= 20) {
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }

            subTotal = litros * precoGasolina;
        }

        totalDesconto = (subTotal / 100) * percentualDesconto;

        double precoAPagar = subTotal - totalDesconto;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
