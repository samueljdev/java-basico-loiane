package Aula07;

public class TesteCarro {
    /* declaração de classes e instância de classes */
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

        System.out.println();

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
    }
}
