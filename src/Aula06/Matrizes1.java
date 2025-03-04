package Aula06;

public class Matrizes1 {
    /* declarando e populando uma matriz multi-dimensional ou arrays de arrays */
    public static void main(String[] args) {
        double[][] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        notasAlunos[3][0] = 10;
        notasAlunos[3][1] = 6;
        notasAlunos[3][2] = 5;
        notasAlunos[3][3] = 7.5;

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        notasAlunos[1][3] = 8;
        System.out.println("----------------------");

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("Cálculando a média de cada aluno: ");

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println(" Média do aluno " + i + " é = " + (soma / 4));
        }

        System.out.println("--------------------------------");
        System.out.println("Vetor e matriz já populados : ");
        /* declarando vetores e arrays já populado */
        double[] notasAlunos1 = {7, 8, 9, 10};
        double[][] notasAlunos2 = {{7, 8, 9, 10}, {7, 8, 9, 10}};

        for (int i = 0; i < notasAlunos2.length; i++) {
            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
