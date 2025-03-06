package Aula09;

public class TesteCarro {
    /* chamada de métodos com retorno double */
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidCombustivel = 100;
        van.consuCombustivel = 0.2;

        /* System.out.println(van); // referência pro endereço de memória */
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiros);
        System.out.println(van.capacidCombustivel);
        System.out.println(van.consuCombustivel);
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia(); /* chamada de métodos com retorno double */
        System.out.println("A autonomia do carro é: " + autonomia);

        System.out.println("-----------------------------------");

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroPassageiros = 4;
        fusca.capacidCombustivel = 30;
        fusca.consuCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numeroPassageiros);
        System.out.println(fusca.capacidCombustivel);
        System.out.println(fusca.consuCombustivel);
        fusca.exibirAutonomia();

        double autonomia1 = van.obterAutonomia(); /* chamada de métodos com retorno double */
        System.out.println("A autonomia do carro é: " + autonomia1);

    }
}
