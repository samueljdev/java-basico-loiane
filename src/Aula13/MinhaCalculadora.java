package Aula13;

/* Sobrecarga de métodos (overload) */
public class MinhaCalculadora {

    /* método soma com dois parametros */
    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /* 1º sobrecarga metodo soma parametros tipos diferentes */
    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /* 2º sobrecarga metodo soma acrescentando parametros */
    public double soma(double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }

    /* 3º sobrecarga metodo soma tipo diferente */
    public int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }
}
