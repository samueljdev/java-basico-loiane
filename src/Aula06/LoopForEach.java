package Aula06;

import java.util.Random;

public class LoopForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        /* for normnal */
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" " + notas[i]);
        }
        System.out.println();

        /* internamente no java  */
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            System.out.print(" " + nota);
        }

        System.out.println();
        System.out.println("Usando o for each");
        for (int nota : notas) {
            System.out.print(" " + nota);
        }
        /* quando se usar o foreach se perde a acesso a variavel de indice-contador */

    }
}
