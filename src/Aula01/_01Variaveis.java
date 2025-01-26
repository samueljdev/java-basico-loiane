package Aula01;

public class _01Variaveis {
    public static void main(String[] args) {

        // convenção java
        int idade = 20;
        String nome = "Samy";
        String nomeDoMeuCahorro = "totó";

        // aceito, mas não usado
        int _idade;
        int $nome;

        // não é convenção java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;
        System.out.println("Nome = "+ nome);
        System.out.println("Idade = "+ idade);

        // má prática, pois pode significar qualquer coisa
        int a = 10;
        String b = "Raio";
    }
}