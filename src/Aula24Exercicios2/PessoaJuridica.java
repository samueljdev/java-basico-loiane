package Aula24Exercicios2;

public class PessoaJuridica extends Contribuente {
    private String cnpj;

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica {" +
                super.toString() +
                "cnpj ='" + cnpj + '\'' +
                "imposto a ser pago ='" + calcularImposto() + '\'' +
                '}';
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.10; // (this.getRendaBruta()/100) * 10; outra forma e fazer
    }
}
