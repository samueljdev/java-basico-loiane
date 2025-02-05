package Aula04;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int numeroMaximo = scan.nextInt();

        for (int i = numero; i <= numeroMaximo; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break; // usado para sair de um for, assim que o valor for encontrado
            }
        }
    }
}
