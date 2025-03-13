package Aula22;

public class TesteClassesAbstratas {
    /* Orientação a Objetos: Herança: classes abstratas */
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa(); // classes abstract ñ podem ser instanciadas
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //pessoa.setEndereco("Rua das Garças, nº 100");
        aluno.setEndereco("Rua das Flores, nº 200");
        professor.setEndereco("Rua das Pedras, nº 300");

        aluno.imprimirEtiquetaEndereco();
        System.out.println("-------------------------------------");
        professor.imprimirEtiquetaEndereco();
    }
}
