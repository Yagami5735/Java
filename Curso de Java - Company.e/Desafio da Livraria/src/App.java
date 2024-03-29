import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        ArrayList<Livro> livrosFisicos = new ArrayList<Livro>();
        ArrayList<Livro> eBooks = new ArrayList<Livro>();

        Scanner input = new Scanner(System.in);

        livrosFisicos.add(new LivroFisico("Devorador de Mundos", "Yan Yoshida Luz", "LF1", 13, 10, 0.4));
        eBooks.add(new Ebook("Devorador de Mundos", "Yan Yoshida Luz", "EB1", 40, 10, 30.4));
        livrosFisicos.add(new LivroFisico("O mentalista", "Yan Yoshida Luz", "LF2", 110, 20, 0.8));

        

        while (true) {
            int escolhaP, escolhaS;
            do {
                System.out.println("\n\t[0] - Mostrar Livros\n\t[1] - Adicionar Livro\n\t[2] - Carrinho" +
                "\n\t[3] - Fechar");
                System.out.print("\nQual deseja escolher? ");

                escolhaP = input.nextInt();
                if (escolhaP < 0 || escolhaP > 5)
                    System.out.println("Digite um valor válido por favor!!!");
            } while (escolhaP < 0 || escolhaP > 5);

            if (escolhaP == 0) {
                do {
                    System.out.println("\n\t[0] - Mostrar Livros Físicos\n\t[1] - Mostrar eBooks\n\t[2] - Voltar");
                    System.out.print("Qual deseja escolher? ");

                    escolhaS = input.nextInt();
                    if (escolhaS < 0 || escolhaS > 2)
                        System.out.println("Digite um valor válido por favor!!!");
                } while (escolhaS < 0 || escolhaS > 2);

                if (escolhaS == 0)
                    mostrarLivros(livrosFisicos);
                else if (escolhaS == 1)
                    mostrarLivros(eBooks);
                else
                    continue;
            }

            if (escolhaP == 1) {
                do {
                    System.out.println("\n\t[0] - Adicionar Livros Físicos\n\t[1] - Adicionar eBooks\n\t[2] - Voltar");
                    System.out.print("\nQual deseja escolher? ");

                    escolhaS = input.nextInt();
                    if (escolhaS < 0 || escolhaS > 2)
                        System.out.println("Digite um valor válido por favor!!!");
                } while (escolhaS < 0 || escolhaS > 2);

                if (escolhaS == 0)
                    adicionarLivroFisico(livrosFisicos);
                else if (escolhaS == 1)
                    adicionarEBooks(eBooks);
                else
                    continue;
            }

            if (escolhaP == 2) {
                do {
                    System.out.println("\n\t[0] - Adicionar livro ao Carrinho\n\t[1] - Remover livro do Carrinho\n\t[2] - Mostrar Carrinho\n\t[3] - Voltar");
                    System.out.print("Qual deseja escolher? ");

                    escolhaS = input.nextInt();
                    if (escolhaS < 0 || escolhaS > 3)
                        System.out.println("Digite um valor válido por favor!!!");
                } while (escolhaS < 0 || escolhaS > 3);
                
                if(escolhaS == 0)
                {   
                    System.out.println("\n\t-Livros Físicos-");
                    mostrarLivros(livrosFisicos);

                    System.out.println("\n\t-eBooks-");
                    mostrarLivros(eBooks);

                    adicionarNoCarrinho(carrinho, livrosFisicos, eBooks);
                }

                else if(escolhaS == 1)
                {
                    carrinho.mostrarCarrinho();

                    removerCarrinho(carrinho, livrosFisicos, eBooks);
                }

                else if(escolhaS == 2)
                {
                    carrinho.mostrarCarrinho();
                }

                else 
                    continue;
        
                
            }

            if (escolhaP == 3)
                break;

        }

    }

    public static void mostrarLivros(ArrayList<Livro> livros) {
        for (Livro l : livros) {
            System.out.println("\n" + l);
        }
    }

    public static void adicionarLivroFisico(ArrayList<Livro> l) {
        Scanner input = new Scanner(System.in);
        String titulo, autor, isbn;
        double preco, peso;
        int qtdL;

        System.out.print("\n\nQuantos livros deseja adicionar? ");
        int qtd = input.nextInt();
        input.nextLine();
        for (int i = 0; i < qtd; i++) {
            do {
                System.out.print("Digite o Título do Livro: ");
                titulo = input.nextLine();

                System.out.print("Digite o Autor do Livro: ");
                autor = input.nextLine();

                System.out.print("Digite o ISBN do Livro: ");
                isbn = input.nextLine();

                System.out.print("Digite o Preço do Livro: ");
                preco = input.nextDouble();

                System.out.print("Digite a quantida de livros: ");
                qtdL = input.nextInt();

                System.out.print("Digite o Peso do Livro: ");
                peso = input.nextDouble();

                if (preco <= 0 || peso <= 0)
                    System.out.println("Valor(es) de preço e/ou peso errados, digite valores válidos por favor!");
            } while (preco <= 0 || peso <= 0);

            l.add(new LivroFisico(titulo, autor, isbn, preco, qtdL, peso));
        }
    }

    public static void adicionarEBooks(ArrayList<Livro> l)

    {
        Scanner input = new Scanner(System.in);
        String titulo, autor, isbn;
        double preco, tamanhoEmMB;
        int qtdL;

        System.out.print("Quantos livros deseja adicionar? ");
        int qtd = input.nextInt();
        input.nextLine();
        for (int i = 0; i < qtd; i++) {
            do {
                System.out.print("Digite o Título do Livro: ");
                titulo = input.nextLine();

                System.out.print("Digite o Autor do Livro: ");
                autor = input.nextLine();

                System.out.print("Digite o ISBN do Livro: ");
                isbn = input.nextLine();

                System.out.print("Digite o Preço do Livro: ");
                preco = input.nextDouble();

                System.out.print("Digite a quantida de livros: ");
                qtdL = input.nextInt();

                System.out.print("Digite o Peso do Livro em MB: ");
                tamanhoEmMB = input.nextDouble();

                if (preco <= 0 || tamanhoEmMB <= 0)
                    System.out.println("Valor(es) de preço e/ou peso errados, digite valores válidos por favor!");

            } while (preco <= 0 || tamanhoEmMB <= 0);

            l.add(new Ebook(titulo, autor, isbn, preco, qtdL, tamanhoEmMB));
        }
    }

    public static void adicionarNoCarrinho(CarrinhoDeCompras c, ArrayList<Livro> f, ArrayList<Livro> e) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Quantos livros deseja adicionar ao carrinho? ");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("\nUtilize o ISBN do livro que deseja adicionar ao carrinho: ");
            String isbn = input.nextLine();
            boolean isFound = false;
            for (Livro l : f) {
                if (l.getIsbn().equals(isbn)) {
                    if(l.getQtd() > 0)
                    {
                        c.addLivroCarrinho(l);
                        isFound = true;
                        System.out.println("Adicionado com Sucesso!");
                        break;
                    }
                    else System.out.println("Livro fora de estoque!");
                    
                }
            }
            for (Livro l : e) {
                if(l.getQtd() > 0)
                {
                    c.addLivroCarrinho(l);
                    isFound = true;
                    System.out.println("Adicionado com Sucesso!");
                    break;
                }
                else System.out.println("Livro fora de estoque!");
                
            }
            if (!isFound)
                System.out.println("Código não encontrado!");
        }
    }

    public static void removerCarrinho(CarrinhoDeCompras c, ArrayList<Livro> f, ArrayList<Livro> e)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\n Quantos livros deseja remover do carrinho? ");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("\nUtilize o ISBN do livro que deseja remover do carrinho: ");
            String isbn = input.nextLine();
            
            if (!c.removerLivroCarrinho(isbn))
                System.out.println("Código não encontrado!");
            else 
            {
                System.out.println("Removido com Sucesso!!!");
                corrigirQtd(f, e, isbn);
            }   
                
        }
    }

    public static void corrigirQtd(ArrayList<Livro> f, ArrayList<Livro> e, String isbn)
    {
        for(Livro l : f)
        {
            if(l.getIsbn().equals(isbn)) 
            {
                l.addQtd();
                break;
            }
        }
        for(Livro l : e)
        {
            if(l.getIsbn().equals(isbn)) 
            {
                l.addQtd();
                break;
            }
        }
    }

    public static void finalizarCompra(CarrinhoDeCompras carrinho) {
        String total = String.format("O valor total dos livros deram: R$%,.2f\n", carrinho.calcularTotal()) +
                String.format("O valor total do frete deram: R$%,.2f\n", carrinho.calcularFretes()) +
                String.format("O valor total apenas dos livros deram: R$%,.2f", carrinho.calcularLivros());
        System.out.println("\n" + total);
        carrinho.limparCarrinho();
    }
}
