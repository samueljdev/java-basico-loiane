package Aula24;

public class TesteClasseObject {
    /* Orientação a Objetos: Classe Object */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        /* Exibindo objeto via metodo toString da Classe Objetc */
        System.out.println(aluno);

        String s1 = "novo";
        String s2 = "novo";

        System.out.println(s1 == s2); // comparando referencia
        System.out.println(s1.equals(s2)); // comparando o conteúdo/atributos do objeto via metodo equals da Classe Objetc

        System.out.println("--------------------------");
        Aluno aluno1 = new Aluno();
        aluno1.setCurso("Ciência da computação");
        double[] notas1 = {10, 9, 8, 7};
        aluno1.setNotas(notas1);

        System.out.println(aluno == aluno1); // comparando referencia
        System.out.println(aluno.equals(aluno1)); // comparando o conteúdo/atributos do objeto via metodo equals da Classe Objetc
    }
}
