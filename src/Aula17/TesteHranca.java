package Aula17;

public class TesteHranca {
    /* Orientação a Objetos: Herança */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        // inserindo dados dos atributos especificos do Aluno
        aluno.setCurso("Sitemas de Informação");
        double[] notas = new double[2];
        notas[0] = 7.0;
        notas[1] = 7.0;
        aluno.setNotas(notas);

        // inserindo dados atraves da herança da super classe Pessoa
        aluno.setNome("Maria");
        aluno.setEndereco("Rua dos Patos");
        aluno.setTelefone("92 0000-9999");
        aluno.setCpf("001.001.001.00");

        Professor professor = new Professor();

        // inserindo dados dos atributos especificos do Professor
        professor.setSalario(1.500);
        professor.setNomeCurso("Geografia");

        // inserindo dados atraves da herança da super classe Pessoa
        professor.setNome("João");
        professor.setEndereco("Rua dos Ganços");
        professor.setTelefone("92 1111-8888");
        professor.setCpf("002.002.002.10");

        // Pessoa é uma Super classe da Subclasse aluno
        // Criamos um objeto do tipo Aluno, referenciado como Pessoa
        // objeto aluno ñ acessa metodos da Super classe Pessoa e não da Subclasse aluno
        Pessoa aluno1 = new Aluno();
        aluno1.setNome("Karlos");
        aluno1.setEndereco("Rua das Galinhas");
        aluno1.setTelefone("92 2222-9999");
        aluno1.setCpf("003.003.003.30");

        // Criamos um objeto do tipo Professor, referenciado como Pessoa
        Pessoa professor1 = new Professor();
        professor1.setNome("Amon");
    }
}
