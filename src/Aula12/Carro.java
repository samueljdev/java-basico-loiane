package Aula12;

public class Carro {
    /* construtores e palavra chave this e Encapsulamento: métodos getters e setters */
    private String marca;
    private String modelo;
    private int numeroPassageiros; // declaração
    private double capacidCombustivel;
    private double consuCombustivel;

    public Carro() {
        System.out.println("Classe carro foi instanciada no 1º costrutor ");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidCombustivel() {
        return capacidCombustivel;
    }

    public void setCapacidCombustivel(double capacidCombustivel) {
        this.capacidCombustivel = capacidCombustivel;
    }

    public double getConsuCombustivel() {
        return consuCombustivel;
    }

    public void setConsuCombustivel(double consuCombustivel) {
        this.consuCombustivel = consuCombustivel;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidCombustivel * this.consuCombustivel + " km");
    }

    /* criação de métodos com parâmetro e retorno */
    public double obterAutonomia() {
        System.out.println("Método obterAutonomia com retorno");
        return this.capacidCombustivel * this.consuCombustivel;
    }

    /* criação de métodos com passagem parâmetro e retorno */
    public double calcularCombustivel(double km) {
        return divideKMporConsumoCombustivel(km); // posso retorna o calculo de metodo
    }

    private double divideKMporConsumoCombustivel(double km) {
        return km / this.consuCombustivel;
    }
}
