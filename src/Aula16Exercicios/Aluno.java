package Aula16Exercicios;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfoAluno() {
        String info = "Nome Aluno = " + getNome() + "\n";
        info += "Matricula = " + getMatricula() + ";";
        info += "Notas: ";

        double soma = 0;
        for (double nota : getNotas()) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma / 4;
        info += "\n" + "Média = " + media + " - ";
        if (media >= 7) {
            info += " Aprovado";
        } else {
            info += " Reprovado";
        }

        return info;
    }

    public double obterMediaAluno() {
        double soma = 0;
        for (double nota : getNotas()) {
            soma += nota;
        }
        return soma / 4;
    }
}
