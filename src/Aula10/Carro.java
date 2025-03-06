package Aula10;

public class Carro {
    /* métodos com passagem parâmetro */
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidCombustivel;
    double consuCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidCombustivel * consuCombustivel + " km");
    }

    /* criação de métodos SEM parâmetro e retorno */
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capacidCombustivel * consuCombustivel;
    }

    /* criação de métodos COM passagem parâmetro e retorno */
    double calcularCombustivel(double km) {
        return km / consuCombustivel;
    }
}
