package Aula18;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno() {
        super(); // super fazendo referencia a super classe Pessoa
    }

    // atraves da herança pode ter acesso ao construtor da super classe
    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone); // super fazendo referencia a super classe Pessoa
    }

    // atraves da herança pode ter acesso ao construtor da super classe + atributos da subclasse
    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso; // this faz referencia a própria classe
        this.notas = notas; // this faz referencia a própria classe
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

    /* Orientação a Objetos: Herança: Palavra chave super */
    public void metodoQualquer() {
        this.curso = ""; // acesso aos atributos da subclasse
        this.setNome(""); // acesso aos metodos da classe super atraves da herança usado o this
        setNome(""); // acesso aos metodos da classe super atraves da herança SEM o this
        super.setCpf(""); // acesso aos metodos da classe super atraves da herança usando o super
    }
}
