package Aula14;

/* Variáveis e metodos estáticos (modificador static) */
public class MinhaCalculadora {

    /* metodo soma com dois parametros */
    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /* 1º sobrecarga metodo soma parametros tipos diferentes */
    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /* 2º sobrecarga metodo soma acrescentando parametros */
    public static double soma(double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }

    /* 3º sobrecarga metodo soma tipo diferente */
    public static int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
