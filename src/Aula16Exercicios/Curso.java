package Aula16Exercicios;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome do Curso = " + getNome() + "\n";

        if (getProfessor() != null) {
            info += professor.obterInfoProfessor();
        }

        if (getAlunos() != null) {
            System.out.println("--------Alunos--------");
            for (Aluno aluno : getAlunos()) {
                if (aluno != null) {
                    info += aluno.obterInfoAluno();
                    info += "\n";
                }
            }
            info += "\nMédia da turma = " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno aluno : getAlunos()) {
            if (getAlunos() != null) {
                soma += aluno.obterMediaAluno();
            }
        }
        return soma / alunos.length;
    }
}
