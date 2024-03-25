public class Livro {

    protected String titulo;
    protected String autor;
    protected String isbn;
    protected double preco;
    protected int qtd;

    public Livro(String titulo, String autor, String isbn, double preco, int qtd) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public double calcularPrecoTotal() {
        return preco;
    }

    public void removerQtd() {
        --qtd;
    }

    public void addQtd() {
        ++qtd;
    }

    @Override
    public String toString() {
        String livro;
        livro = String.format("ISBN do livro..: %s\n", isbn, null) +
                String.format("Título do livro: %s\n", titulo) +
                String.format("Autor do livro.: %s\n", autor) +
                String.format("Preço do livro.: R$%,.2f", preco);

        return livro;
    }
}
