package Aula22;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    public Professor() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String obterEtiquetaEndereco() {
        String msg = "Endereço do Professor: ";
        msg += super.getEndereco();
        return msg;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(obterEtiquetaEndereco());
        System.out.println("Implementando metodo abastato no Professor: ");
    }
}
