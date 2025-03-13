package Aula23;

public class TestePalavraChaveFinal {
    /* Orientação a Objetos: Palavra chave final */
    public static void main(String[] args) {
        /* Uma classe final não pode ser estendida, ou seja, não pode ter classes que herdam dela. */
        /* É importante para garantir que uma determinada implementação não tenha seu comportamento modificado. */
        /* Subclasses não podem herdar uma classe final. */

        /*
        // não é possível estender a classe Pessoa
        public class Aluno extends Pessoa {
        }

        Nem instanciar declarar um pessoa referenciando(instanciando) a Classe Aluno
        Pessoa aluno = new Aluno();

        OBS: Objetivo de uma classe final é impedir Heranças e modificação das classes atraves d poliformismo
        */

        /* final em atributos */
        System.out.println("Constantes.URL_BLOG = " + Constantes.URL_BLOG);
        Constantes.URL_BLOG = "MeuBLog";
        System.out.println("Constantes.URL_BLOG = " + Constantes.URL_BLOG); /* Não tendo final no atributo pode alterar */

        System.out.println("-------------------------------------");

        System.out.println("Constantes.CURSO_COMPLETO = " + Constantes.CURSO_COMPLETO);
        // Constantes.CURSO_COMPLETO = "Novo Curso"; /* Com atributo cm final NÃO Permite alterações */
    }
}
