package Aula13;

public class TesteCalculadora {
    /* Sobrecarga de métodos (overload) */
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();

        int resultado1 = calculadora.soma(1, 2);
        System.out.println("Resultado da soma: " + resultado1);

        double resultado2 = calculadora.soma(5.5, 4.5);
        System.out.println("Resultado da soma: " + resultado2);

        double resultado3 = calculadora.soma(2.2, 3.9, 29.5);
        System.out.println("Resultado da soma: " + resultado3);

        int[] notasAlunos = {5, 5, 5, 5, 5};

        int resultado4 = calculadora.soma(notasAlunos);
        System.out.println("Resultado da soma: " + resultado4);
    }
}
