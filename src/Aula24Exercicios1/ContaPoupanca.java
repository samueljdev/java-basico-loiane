package Aula24Exercicios1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if (getDiaRendimento() == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento)); // saldo += saldo * taxaRendimento
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaPoupanca {" +
                super.toString()
                + " diaRendimento = " + diaRendimento +
                '}';
    }
}
