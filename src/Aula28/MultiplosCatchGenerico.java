package Aula28;

public class MultiplosCatchGenerico {
    /* Exceptions: multiplos catch */
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException e) { // exceções especificas 1º
                System.out.println("Erro ao dividir por zero");
            } catch (Throwable e) { // Evitar usar exceções genericas tipo Throwable
                System.out.println("Ocorreu um erro");
            }
        }
    }
}
