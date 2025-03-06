package Aula12;

public class TesteCarro {
    /* construtores e palavra chave this e Encapsulamento: métodos getters e setters */
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Onix");
        carro1.setNumeroPassageiros(8);
        carro1.setCapacidCombustivel(2.0);
        carro1.setConsuCombustivel(0.2);

        System.out.println("Marca de carro " + carro1.getMarca());
        System.out.println("Modelo de carro " + carro1.getModelo());
        System.out.println("Nº de passageiros " + carro1.getNumeroPassageiros());
        System.out.println("Capacidade de combustivel " + carro1.getCapacidCombustivel());
        System.out.println("Consumo de combustivel " + carro1.getConsuCombustivel());

        carro1.exibirAutonomia();

        double obterAutonomia = carro1.obterAutonomia();
        System.out.println("Consumo de combustivel = " + obterAutonomia);

        double calcularCombustivel = carro1.calcularCombustivel(50);
        System.out.println("Calculo de combustivel " + calcularCombustivel);

        System.out.println("-------------------------------------------- ");
    }
}
