package Aula16Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    /* Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um Professor,
    que possui nome, departamento e email. Cada Curso também pode ter vários alunos (tipo Aluno).
    Cada Aluno tem nome, matricula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos,
    e que preça para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno,
    se o mesmo está aprovado (media maior ou igual a 7), e qual é a média da turma. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Entre com o horário do curso: ");
        String horarioCurso = scan.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProfessor = scan.nextLine();

        System.out.println("Entre com o email do professor: ");
        String emailProfessor = scan.nextLine();

        System.out.println("Entre com o departamento: ");
        String departProfessor = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horarioCurso);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setEmail(emailProfessor);
        professor.setDepartamento(departProfessor);

        curso.setProfessor(professor);

        System.out.println("-------------Alunos-------------");
        Aluno[] alunos = new Aluno[4];
        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Entre com a nome do aluno: ");
            String nomeAluno = scan.next();

            System.out.println("Entre com a matricula do aluno: ");
            String matriculaAluno = scan.next();

            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Entre com a nota do aluno: ");
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
