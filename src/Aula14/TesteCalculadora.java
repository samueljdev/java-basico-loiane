package Aula14;

public class TesteCalculadora {
    /* Variáveis e metodos estáticos (modificador static) */
    public static void main(String[] args) {

        /* Sem precisar instanciar classes */
        int resultado1 = MinhaCalculadora.soma(1, 2);
        System.out.println("Resultado da soma: " + resultado1);

        double resultado2 = MinhaCalculadora.soma(5.5, 4.5);
        System.out.println("Resultado da soma: " + resultado2);

        double resultado3 = MinhaCalculadora.soma(2.2, 3.9, 29.5);
        System.out.println("Resultado da soma: " + resultado3);

        int[] notasAlunos = {5, 5, 5, 5, 5};

        int resultado4 = MinhaCalculadora.soma(notasAlunos);
        System.out.println("Resultado da soma: " + resultado4);
    }
}
