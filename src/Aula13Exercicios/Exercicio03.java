package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    /* Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, métodos getters e setters
    e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos. Se necessário,
    crie métodos privados como auxiliares para organizar melhor o código fonte também. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPosicao(i, scan.next());
        }

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.setNomePosicaoIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
            }
        }
    }
}
