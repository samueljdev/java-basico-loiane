package Aula15Exercicios;

public class Somatorio {
    // 5 = 5 + 4 + 3 + 2 + 1
    // 5 = 4 + 3 + 2 + 1
    // 3 = 3 + 2 + 1
    // 2 = 2 + 1
    // 1 = 1
    public static int somatorio(int numero) {
        if (numero == 1){
            return 1;
        }
        return numero + somatorio(numero - 1);
    }
}
