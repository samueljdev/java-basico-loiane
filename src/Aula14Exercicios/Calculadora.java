package Aula14Exercicios;

public class Calculadora {
    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static double potenciaMath(int numero1, int numero2) {
        return Math.pow(numero1, numero2);
    }

    //xˆn
    // x * x * x * x (n vezes)
    public static int potenciaFor(int numero1, int numero2) {
        int total = 1;
        for (int i = 1; i <= numero2; i++) {
            total *= numero1;
        }
        return total;
    }

    public static void imprimirTelaInt(int numero) {
        System.out.println(numero);
    }

    public static void imprimirTelaDouble(double numero) {
        System.out.println(numero);
    }

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    public static int fatorial(int numero) {

        if (numero == 0) {
            return 1;
        }

        int total = 1;
        for (int i = numero; i > 1; i--) {
            total *= i;
        }

        return total;
    }
}
