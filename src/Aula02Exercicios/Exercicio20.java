package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio20 {
    /* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    a. "Telefonou para a vítima?"
    b. "Esteve no local do crime?"
    c. "Mora perto da vítima?"
    d. "Devia para a vítima?"
    e. "Já trabalhou com a vítima?"
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
    entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente"*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scan.next();

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scan.next();

        System.out.print("Já trabalhou com a vítima? ");
        String resposta4 = scan.next();

        System.out.print("Devia para a vítima? ");
        String resposta5 = scan.next();

        int cont = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta2.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta3.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta4.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resposta5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}
