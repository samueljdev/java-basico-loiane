package Aula07Exercicios;

import java.util.Date;

public class Exercicio04 {
    /* Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” que
     represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores */
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Curso de Programação";
        livro.autor = "Pato Mágico";
        livro.anoLancamento = 2025;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.isbn = "4123";
        livro.qtdPaginas = 150;
        livro.emprestadoA = " Lola Loiane";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do livro = " + livro.autor);
        System.out.println("Ano de Lançamento do livro = " + livro.anoLancamento);
        System.out.println("Livro emprestado? = " + livro.emprestado);
        System.out.println("Data Entrega do livro = " + livro.dataEntrega);
        System.out.println("Livro emprestado de = " + livro.emprestadoA);
        System.out.println("Isbn do livro = " + livro.isbn);
        System.out.println("Quantidade de páginas do livro = " + livro.qtdPaginas);
    }
}
