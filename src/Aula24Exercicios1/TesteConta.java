package Aula24Exercicios1;

public class TesteConta {
    public static void main(String[] args) {
        System.out.println(" ************** Conta Bancaria ************** ");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente("Cliente Conta Simples");
        contaBancaria.setNumConta("1111");
        contaBancaria.depositar(100);
        contaBancaria.sacar(70);
        realizarSaque(contaBancaria, 50);
        System.out.println(contaBancaria);
        System.out.println();

        System.out.println(" ************** Conta Poupança ************** ");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.depositar(200);
        System.out.println("Saldo da Conta poupança = " + contaPoupanca.getSaldo());
        contaPoupanca.setDiaRendimento(27);
        contaPoupanca.sacar(50);
        realizarSaque(contaPoupanca, 50);
        exibirSaldoDoRendimento(contaPoupanca, 0.5);
        System.out.println(contaPoupanca);
        System.out.println();

        System.out.println(" ************** Conta Especial ************** ");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("3333");
        System.out.println(contaEspecial);
        contaEspecial.setLimite(50);
        contaEspecial.depositar(100);
        System.out.println(contaEspecial);
        contaEspecial.sacar(50);
        System.out.println(contaEspecial);
        contaEspecial.sacar(80);
        System.out.println(contaEspecial);
        realizarSaque(contaEspecial, 50);
        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + 50 + ": saldo de = " + conta.getSaldo());
        }
    }

    private static void exibirSaldoDoRendimento(ContaPoupanca contaPoupanca, double valor) {
        if (contaPoupanca.calcularNovoSaldo(valor)) {
            System.out.println("Rendimento apliciado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo calculado");
        }
    }
}
