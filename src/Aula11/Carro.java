package Aula11;

public class Carro {
    /* construtores e palavra chave this */
    String marca;
    String modelo;
    int numeroPassageiros; // declaração
    double capacidCombustivel;
    double consuCombustivel;

    public Carro() {
        System.out.println("Classe carro foi instanciada no 1º costrutor ");
        this.numeroPassageiros = 4; // atribuição de valores iniciais
    }

    public Carro(String marca) {
        System.out.println("Classe carro foi instanciada no 2º costrutor ");
        this.marca = marca;
    }

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidCombustivel, double consuCombustivel) {
        System.out.println("Classe carro foi instanciada no 3º costrutor ");
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidCombustivel = capacidCombustivel;
        this.consuCombustivel = consuCombustivel;
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidCombustivel * this.consuCombustivel + " km");
    }

    /* criação de métodos com parâmetro e retorno */
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capacidCombustivel * this.consuCombustivel;
    }

    /* criação de métodos com passagem parâmetro e retorno */
    double calcularCombustivel(double km) {
        return km / this.consuCombustivel;
    }
}
