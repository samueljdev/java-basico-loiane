package Aula15;

public class TesteCalculadora {
    /* Recursividade: em programação é um mecanismo que define uma função ou objeto em termos de si mesmo.
    Ou seja, é uma função que se chama a si mesma. */
    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);
    }
}
