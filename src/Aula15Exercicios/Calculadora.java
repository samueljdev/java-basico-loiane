package Aula15Exercicios;

public class Calculadora {
    public static int calcularFibonacci(int numero) {
        if (numero < 2) {
            return 1;
        }
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }
}
