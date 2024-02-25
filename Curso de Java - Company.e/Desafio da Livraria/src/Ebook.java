public class Ebook extends Livro {
    protected double tamanhoEmMb;

    public Ebook(String titulo, String autor, String isbn, double preco, int qtd, double tamanhoEmMb)
    {
        super(titulo, autor, isbn, preco, qtd);
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public double calcularPrecoTotal()
    {
        return preco;
    }

    @Override
    public String toString() {
        String livro;
        livro = String.format("ISBN do livro...: %s\n", isbn, null) +
        String.format("Título do livro....: %s\n", titulo) + 
        String.format("Autor do livro.....: %s\n", autor) +
        String.format("Preço do livro.....: R$%,.2f\n", preco) +
        String.format("Quantidade do livro: %d\n", qtd) + 
        String.format("Tamanho do livro: %,.1fmb\n", tamanhoEmMb);
        return livro;
    }
}
