package Aula04;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int numeroMaximo = scan.nextInt();

        for (int i = numero; i <= numeroMaximo; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                continue; // é mais indicado o "continue" quando temos for alinhados, for dentro de for
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
