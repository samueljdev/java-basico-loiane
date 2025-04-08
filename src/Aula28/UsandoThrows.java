package Aula28;

import java.util.Scanner;

public class UsandoThrows {
    /* Exceptions: Usando Throws */
    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try {
            double numero = leNumero();
            System.out.println("Você digitou " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
