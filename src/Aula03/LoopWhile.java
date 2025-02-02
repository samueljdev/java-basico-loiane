package Aula03;

public class LoopWhile {
    public static void main(String[] args) {

        int contador = 1; //count ou contador
        int maximo = 10;

        System.out.println("Contando até " + maximo);

        while (contador <= maximo) {
            System.out.println("Valor de i: " + contador);
            contador++; // i = i + 1; ou i += 1;
        }

        System.out.println(contador); //valor de 11

        do {
            contador++;
            System.out.println("Valor de i: " + contador);
        } while (contador <= 14);

        System.out.println(contador);
    }
}
