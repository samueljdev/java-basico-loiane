package Aula13Exercicios;

public class Exercicio01 {
    /* Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, métodos getters e setters
    e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos. Se necessário,
    crie métodos privados como auxiliares para organizar melhor o código fonte também.
    Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada */
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
