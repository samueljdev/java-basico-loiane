package Aula22;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterEtiquetaEndereco() {
        String msg = "Endereço do Aluno: ";
        msg += this.getEndereco();
        return msg;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(obterEtiquetaEndereco());
        System.out.println("Implementando metodo abastato no aluno: ");
    }
}
