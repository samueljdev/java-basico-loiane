package Aula11;

public class TesteCarro {
    /* construtores e palavra chave this */
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Ducato";
        carro1.capacidCombustivel = 100;
        carro1.consuCombustivel = 0.2;

        System.out.println("Modelo de carro " + carro1.modelo);
        System.out.println("Nº de passageiros " + carro1.numeroPassageiros); // mostrando valores já setados no construtor
        System.out.println("Capacidade de combustivel " + carro1.capacidCombustivel);
        System.out.println("Consumo de combustivel " + carro1.consuCombustivel);
        System.out.println("-------------------------------------------- ");

        Carro carro2 = new Carro();
        carro2.marca = "Hilux";
        carro2.modelo = "Ford";
        carro2.numeroPassageiros = 8; // setando novos valores na instancia
        carro2.capacidCombustivel = 300;
        carro2.consuCombustivel = 2.8;

        System.out.println("Modelo de carro " + carro2.modelo);
        System.out.println("Nº de passageiros " + carro2.numeroPassageiros);
        System.out.println("Capacidade de combustivel " + carro2.capacidCombustivel);
        System.out.println("Consumo de combustivel " + carro2.consuCombustivel);
        System.out.println("-------------------------------------------- ");

        Carro carro3 = new Carro("Ferrari");

        System.out.println("Modelo de carro " + carro3.marca);
        System.out.println("-------------------------------------------- ");

        Carro carro4 = new Carro("Renault", "Sandeiro", 8, 50,1.2);

        System.out.println("Modelo de carro " + carro4.modelo);
        System.out.println("Nº de passageiros " + carro4.numeroPassageiros);
        System.out.println("Capacidade de combustivel " + carro4.capacidCombustivel);
        System.out.println("Consumo de combustivel " + carro4.consuCombustivel);
    }
}
