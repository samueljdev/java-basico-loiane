package Aula21;

public class TestePolimorfismo {
    /* Orientação a Objetos: Herança e Polimorfismo: sobrecarga de métodos */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        /* No caso de sobrecarga de métodos, o compilador  */

        pessoa.setEndereco("Rua das Garças, nº 100");
        aluno.setEndereco("Rua das Flores, nº 200");
        professor.setEndereco("Rua das Pedras, nº 300");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
