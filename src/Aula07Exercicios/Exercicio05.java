package Aula07Exercicios;

public class Exercicio05 {
    /* Cria	uma	classe para representar	uma	conta corrente que possui um número, um	saldo,
    um status que informa se ela é especial ou não, um limite */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Número da conta " + conta.numero);
        System.out.println("Agência da conta " + conta.agencia);
        System.out.println("Cheque especial " + conta.especial);
        System.out.println("Limite Especial " + conta.limiteEspecial);
        System.out.println("Saldo da conta " + conta.saldo);
    }
}
