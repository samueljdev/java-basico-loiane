package Aula07Exercicios;

public class Exercicio02 {
    /* Crie uma classe Livro que represente os	dados básicos de um	livro, sem se preocupar	com	a sua finalidade. */
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Algortimo Java";
        livro.autor = "Samuel Lisboa";
        livro.anoLancamento = 2025;
        livro.isbn = "1234";
        livro.qtdPaginas = 200;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do autor = " + livro.autor);
        System.out.println("Ano de Lancamento do livro = " + livro.anoLancamento);
        System.out.println("Isbn do livro = " + livro.isbn);
        System.out.println("Quantidade de páginas do livro = " + livro.qtdPaginas);
    }
}
