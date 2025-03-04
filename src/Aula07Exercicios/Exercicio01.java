package Aula07Exercicios;

public class Exercicio01 {
    /* Escreva uma classe para	representar uma lâmpada	que está à venda em um supermercado */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A50";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 24;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;
        lampada.tipos = new String[5]; // todo tipo definido como vetor é necessário instanciar para poder inserir valroes
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Lanparina";
        lampada.tipos[3] = "tocha";

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.garantiaMeses);
        System.out.println(lampada.potencia);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipoLuz);
        System.out.println(lampada.tipoAbajur);
        System.out.println(lampada.tipos[0]);
        System.out.println(lampada.tipos[1]);
        System.out.println(lampada.tipos[2]);
        System.out.println(lampada.tipos[3]);
    }
}

