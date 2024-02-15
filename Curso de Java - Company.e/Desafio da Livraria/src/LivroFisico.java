public class LivroFisico extends Livro{
    protected double peso;
    protected double frete;

    public LivroFisico(String titulo, String autor, String isbn, double preco, double peso)
    {
        super(titulo, autor, isbn, preco);
        this.peso = peso;
        if(peso<=0.2)
        {
            this.frete = 10;
        }
        else if(peso>0.2 && peso<=0.6)
        {
            this.frete = 15;
        }
        else if(peso>0.6 && peso <=1.2)
        {
            this.frete = 20;
        }
        else if(peso > 1.2)
        {
            this.frete = 25;
        }
    }

    public double getFrete() {
        return frete;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public double calcularPrecoTotal(){
        return preco+frete;
    }

    @Override
    public String toString() {
        String livro;
        livro = String.format("ISBN do livro..: %s\n", isbn, null) +
        String.format("Título do livro: %s\n", titulo) + 
        String.format("Autor do livro.: %s\n", autor) +
        String.format("Preço do livro.: R$%,.2f\n", preco) + 
        String.format("Peso do livro..: %,.1fKG\n", peso) +
        String.format("Frete do Livro.: R$%,.2f", frete);
        return livro;
    }
}
