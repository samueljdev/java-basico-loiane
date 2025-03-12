package Aula20;

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

    public void modificadoresDeAcesso() {
        System.out.println(super.visibilidadeDefault = "\nmodificadores de acesso default pode ser acessado por todas as classes dentro pacotes/diretorio local");
        System.out.println(this.visibilidadePublic = "modificadores de acesso public pode ser acessado por todas as classes dentro pacotes/diretorios do projeto inteiro");
        System.out.println(super.getVisibilidadePrivate());
        System.out.println(super.getVisibilidadeProtected());
    }

}
