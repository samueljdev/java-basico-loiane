package Aula24;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
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

    /* toString gerado manualmente
    public String toString() {
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }
    */

    @Override
    public String toString() {
        return "Aluno {" +
                "curso ='" + curso + '\'' +
                ", notas =" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Objects.deepEquals(notas, aluno.notas);
    }

}
