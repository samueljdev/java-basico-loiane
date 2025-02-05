package Aula03Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    /* O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui
    uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar.
    O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias.
    Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve
    então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para
    então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar
    ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
    Lojas Tabajara
    Produto 1: R$ 2.20
    Produto 2: R$ 5.80
    Produto 3: R$ 0
    Total: R$ 9.00
    Dinheiro: R$ 20.00
    Troco: R$ 11.00
    ...  */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int quantidadeProduto;
        double preco;
        double total;
        StringBuilder output;
        double valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = new StringBuilder("Lojas Tabajara\n");

                System.out.println("Digite a quantidade de produtos da compra: ");
                quantidadeProduto = scan.nextInt();

                total = 0;

                for (int i = 1; i <= quantidadeProduto; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output.append("Produto ").append(i).append(": R$ ").append(preco).append("\n");
                }

                output.append("Total: R$ ").append(total);
                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago: ");
                valorPago = scan.nextDouble();
                System.out.println("------------------------");

                output.append("Dinheiro: R$ ").append(valorPago).append("\n");
                troco = total - valorPago;
                output.append("Troco: R$ ").append(troco);

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);
    }
}
