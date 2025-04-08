package Aula28;

public class Exceptions {
    /* Exceptions: try, catch */
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");
            vetor[4] = 1; // aqui está o erro
            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção ao acessar um índide do vetor que não existe"); // tratando o erro
        }

        System.out.println("Esse texto será impresso após a exception");
    }
}
