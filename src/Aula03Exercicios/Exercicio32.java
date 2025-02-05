package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio32 {
    /* O cardápio de uma lanchonete é o seguinte:
    Especificação Código Preço
    Cachorro Quente 100 R$ 1,20
    Bauru Simples 101 R$ 1,30
    Bauru com ovo 102 R$ 1,50
    Hambúrguer 103 R$ 1,20
    Cheeseburguer 104 R$ 1,30
    Refrigerante 105 R$ 1,00
    Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
    Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral
    do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        int codigo, quantidade;
        double total = 0;
        StringBuilder output = new StringBuilder();

        do {
            System.out.println("Digite o código e a quantidade ou digite 00 para sair.");
            codigo = scan.nextInt();
            quantidade = scan.nextInt();

            if (codigo == 0 && quantidade == 0) {
                naoTerminar = false;
                output.append("Total a pagar = ").append(total);
            } else {
                if (codigo == 100) {
                    output.append("Cachorro Quente -> 1,20 * ").append(quantidade);
                    output.append(" = ").append(1.2 * quantidade).append("\n");
                    total += 1.2 * quantidade;
                } else if (codigo == 101) {
                    output.append("Bauru Simples -> 1,30 * ").append(quantidade);
                    output.append(" = ").append(1.3 * quantidade).append("\n");
                    total += 1.3 * quantidade;
                } else if (codigo == 102) {
                    output.append("Bauru com ovo -> 1,50 * ").append(quantidade);
                    output.append(" = ").append(1.5 * quantidade).append("\n");
                    total += 1.5 * quantidade;
                } else if (codigo == 103) {
                    output.append("Hambúrguer -> 1,20 * ").append(quantidade);
                    output.append(" = ").append(1.2 * quantidade).append("\n");
                    total += 1.2 * quantidade;
                } else if (codigo == 104) {
                    output.append("Cheeseburguer -> 1,30 * ").append(quantidade);
                    output.append(" = ").append(1.3 * quantidade).append("\n");
                    total += 1.3 * quantidade;
                } else if (codigo == 105) {
                    output.append("Refrigerante -> 1,00 * ").append(quantidade);
                    output.append(" = ").append(1.0 * quantidade).append("\n");
                    total += 1.0 * quantidade;
                }
            }

        } while (naoTerminar);

        System.out.println(output);
    }
}
