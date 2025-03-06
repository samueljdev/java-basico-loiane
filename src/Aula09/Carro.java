package Aula09;

public class Carro {
    /* chamada de métodos com retorno double */
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidCombustivel;
    double consuCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidCombustivel * consuCombustivel + " km");
    }

    /* criação de métodos com retorno */
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capacidCombustivel * consuCombustivel;
    }
}
