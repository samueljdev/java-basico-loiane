package Aula27Exercicios;

public class TestePolimorfismo {
    /* Orientação a Objetos: Correção Exercícios Aula 46 - Parte 3 (Polimorfismo) */
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setNome("Quadrado");
        quadrado.setCor("verde");
        quadrado.setLado(2);

        Circulo circulo = new Circulo();
        circulo.setNome("circulo");
        circulo.setRaio(2);

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("triangulo");
        triangulo.setAltura(2);
        triangulo.setBase(3);

        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setLado(3);

        Cilindro cilindro = new Cilindro();
        cilindro.setNome("Cilindro");
        cilindro.setAltura(3);
        cilindro.setRaio(2);

        Piramide piramide = new Piramide();
        piramide.setNome("Piramide");
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumeroPoligonoBase(4);
        piramide.setBase(quadrado);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("-----------------------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println(figura2D.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D figura3D = (Figura3D) figura;
                System.out.println(figura3D.calcularArea());
                System.out.println(figura3D.calcularVolume());
            }
        }
    }
}
