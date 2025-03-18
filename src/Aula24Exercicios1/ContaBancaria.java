package Aula24Exercicios1;

import java.util.Objects;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if ((this.getSaldo() - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor); // saldo += saldo - taxaRendimento
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria {" +
                "nomeCliente = '" + nomeCliente + '\'' +
                ", numConta = '" + numConta + '\'' +
                ", saldo = " + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Double.compare(saldo, that.saldo) == 0 && Objects.equals(nomeCliente, that.nomeCliente) && Objects.equals(numConta, that.numConta);
    }
}
