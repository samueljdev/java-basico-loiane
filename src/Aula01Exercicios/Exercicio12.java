package Aula01Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    /* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês,
    sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
    faça um programa que nos dê:
    1. salário bruto.
    a. quanto pagou ao INSS.
    b. quanto pagou ao sindicato.
    c. o salário líquido.
    d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
    Salário Bruto = - IR (11%) - INSS (8%) - Sindicato (5%)
    : Salário Liquido = Salário Bruto - Descontos = Salário Líquido */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor da hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Entre com um número de horas trabalhadas: ");
        double horaTrabalha = scan.nextDouble();

        double salarioBruto = valorHora * horaTrabalha;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoRenda = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println(" Salário Bruto: " + salarioBruto);
        System.out.println(" Desconto de INSS: " + inss);
        System.out.println(" Desconto de Sindicato: " + sindicato);
        System.out.println(" Desconto Imposto Renda: " + impostoRenda);
        System.out.println(" Total de Descontos: " + totalDescontos);
        System.out.println(" Salário Líquido: " + salarioLiquido);
    }
}
