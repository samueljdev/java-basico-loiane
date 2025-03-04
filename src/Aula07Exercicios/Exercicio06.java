package Aula07Exercicios;

public class Exercicio06 {
    /* Crie	uma	classe que represente um contato da	agenda do seu celular */
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.nome = "João da Silva";
        contato1.endereco = "Av Paulista, 1010";
        contato1.email = "joao@email.com";
        contato1.telefones = new String[5];
        contato1.telefones[0] = "11111-9999";
        contato1.telefones[1] = "22222-9998";
        contato1.telefones[2] = "33333-9997";

        System.out.println("Nome do Contato = " + contato1.nome);
        System.out.println("Nome do Contato = " + contato1.endereco);
        System.out.println("Nome do Contato = " + contato1.email);
        System.out.println("Nome do Contato = " + contato1.telefones[0]);
        System.out.println("Nome do Contato = " + contato1.telefones[1]);
        System.out.println("Nome do Contato = " + contato1.telefones[2]);
    }
}
