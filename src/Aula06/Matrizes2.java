package Aula06;

public class Matrizes2 {
    /* Fazendo matrizes tri-dimensional */
    public static void main(String[] args) {
        int[][][] matrizTriDimensional = new int[3][3][3];

        for (int i = 0; i < matrizTriDimensional.length; i++) {
            for (int j = 0; j < matrizTriDimensional[i].length; j++) {
                for (int k = 0; k < matrizTriDimensional[i][j].length; k++) {
                    System.out.println("i = " + i + " - j " + j + " k - " + k);
                    matrizTriDimensional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTriDimensional.length; i++) {
            for (int j = 0; j < matrizTriDimensional[i].length; j++) {
                for (int k = 0; k < matrizTriDimensional[i][j].length; k++) {

                    soma += matrizTriDimensional[i][j][k];
                    if (matrizTriDimensional[i][j][k] % 2 == 0) {
                        somaPares += matrizTriDimensional[i][j][k];
                    } else {
                        somaImpares += matrizTriDimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Soma Pares: " + somaPares);
        System.out.println("Soma Impares: " + somaImpares);
    }
}
