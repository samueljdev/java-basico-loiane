package Aula02Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    /* Faça um Programa que verifique se uma letra digitada é vogal ou consoante */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com uma letra: ");
        String letra = scan.next();

        /* Fazendo apenas com If
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")){
            System.out.println("vogal");
        }  else {
             System.out.println("consoante");
        }*/

        // Fazendo if + switch
        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("consoante");
            }
        }
    }
}
