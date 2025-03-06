package Aula10Exercicios;

public class Exercicio01 {
    /* Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
