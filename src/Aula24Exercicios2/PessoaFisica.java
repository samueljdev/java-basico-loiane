package Aula24Exercicios2;

public class PessoaFisica extends Contribuente {
    private String cpf;

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica {" +
                super.toString() +
                "cpf ='" + cpf + '\'' +
                "imposto a ser pago ='" + calcularImposto() + '\'' +
                '}';
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();
        if (renda <= 1400) {
            return 0;
        } else if (renda > 1.400 && renda <= 2.100) {
            return (renda * 0.10) - 100;
        } else if (renda > 2.100 && renda <= 2.800) {
            return (renda * 0.15) - 270;
        } else if (renda > 2.800 && renda <= 3.600) {
            return (renda * 0.25) - 500;
        }
        return (renda * 0.30) - 700;
    }


}
