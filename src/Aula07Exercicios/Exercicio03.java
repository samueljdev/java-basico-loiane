package Aula07Exercicios;

public class Exercicio03 {
    /* Usando o resultado do exercício	anterior como base, crie uma classe “LivroDeLivraria”
     que represente os dados básicos de um	livro que está à venda em uma livraria */
    public static void main(String[] args) {
        LivroDeLivraria livro = new LivroDeLivraria();
        livro.nome = "Programação Orientada a Objetos";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2025;
        livro.preco = 69.98;
        livro.isbn = "4123";
        livro.qtdPaginas = 200;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Nome do autor = " + livro.autor);
        System.out.println("Ano de Lancamento do livro = " + livro.anoLancamento);
        System.out.println("Preço do livro = " + livro.preco);
    }
}
