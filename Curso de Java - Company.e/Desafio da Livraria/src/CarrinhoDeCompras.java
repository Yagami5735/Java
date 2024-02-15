import java.util.ArrayList;

public class CarrinhoDeCompras{
    protected ArrayList<Livro> carrinho = new ArrayList<Livro>();
    private double valorTotal, valorTotalFrete, valorTotalLivros;

    public void addLivroCarrinho(Livro livro)
    {
        carrinho.add(livro);
    }

    public double calcularTotal()
    {
        for(Livro l : carrinho)
        {
            
            if(l instanceof Ebook)
            {
                valorTotal+=((Ebook)l).calcularPrecoTotal();
            }

            if(l instanceof LivroFisico)
            {
                valorTotal+= ((LivroFisico)l).calcularPrecoTotal();
            }
        }

        return valorTotal;
    }

    public double calcularLivros()
    {
        for(Livro l : carrinho)
        {
            valorTotalLivros+=l.getPreco();
        }
        return valorTotalLivros;
    }

    public double calcularFretes()
    {
        for(Livro l : carrinho)
        {
            if(l instanceof LivroFisico)valorTotalFrete+=((LivroFisico)l).getFrete();
        }
        return valorTotalFrete;
    }

    public void mostrarCarrinho()
    {
        if(carrinho.isEmpty())System.out.println("\nCarrinho vazio!!!");
        for(Livro l: carrinho)System.out.println("\n" + l);
    }

    public void limparCarrinho()
    {
        carrinho.clear();
    }
    
}
