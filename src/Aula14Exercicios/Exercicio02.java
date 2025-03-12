package Aula14Exercicios;

public class Exercicio02 {
    /* Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois números),
     elevar à potência n. Desenvolvaum programa para testar essa classe */
    public static void main(String[] args) {

        Calculadora.imprimirTelaInt(Calculadora.soma(2, 2));
        Calculadora.imprimirTelaInt(Calculadora.subtrair(10, 2));
        Calculadora.imprimirTelaInt(Calculadora.multiplicar(10, 2));
        Calculadora.imprimirTelaInt(Calculadora.dividir(10, 2));
        Calculadora.imprimirTelaInt(Calculadora.potenciaFor(2, 4));
        Calculadora.imprimirTelaDouble(Calculadora.potenciaMath(4, 4));
    }
}

