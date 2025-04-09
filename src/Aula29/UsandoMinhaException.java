package Aula29;

public class UsandoMinhaException {
    /* Exceptions: criando sua própria exceção */
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 21, 64, 88};
        int[] denominador = {2, 0, 17, 8, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominador[i]); // lançar a exception aqui
                }
                System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
