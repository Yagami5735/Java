import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Tarefa> x = new ArrayList<Tarefa>();

        while (true) 
        {  
            boolean exit = false;
            System.out.println("\n\t [0] - Adicionar tarefa\n\t [1] - Remover Tarefa\n\t [2] - Listar Tarefas\n\t [3] - Listar em Ordem Alfabética\n\t [4] - Listar em Ordem Cronológica\n\t [5] - Sair\n ");
            System.out.print("Qual opção deseja selecionar? ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    criarTarefa(x);
                    break;
                
                case 1:
                    removerTarefa(x);
                    break;

                case 2:
                    listarTarefas(x);
                    break;

                case 3:
                    listarEmOrdemAlfabetica(x);
                    break;

                case 4:
                    listarEmOrdemCronologica(x);
                    break;
                case 5:
                    exit = true;
                    input.close();
                    break;
                default:
                    break;
            }
            if(exit)break;
        }
    }

    public static void listarTarefas(ArrayList<Tarefa> lista) {
        for (Tarefa item : lista) {
            System.out.println("\n" + item.mostraTarefa());
        }
    }

    public static void criarTarefa(ArrayList<Tarefa> lista) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nQuantas tarefas deseja adicionar? ");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {

            System.out.print("\nDigite o nome da tarefa: ");
            String nome = input.nextLine();

            System.out.print("Digite o tipo da tarefa: ");
            String tipo = input.nextLine();

            System.out.print("Digite o local da tarefa: ");
            String local = input.nextLine();

            boolean tarefaExistente = false;
            for (int j = 0; j < lista.size(); j++) {
                if (nome.equals(lista.get(j).getNome())) {
                    tarefaExistente = true;
                    System.out.println("\nTarefa já existente, adicione uma tarefa que não exista por favor!!!");
                    break;
                }
            }

            if (!tarefaExistente) {
                lista.add(new Tarefa(nome, tipo, local));
                System.out.println("\nAdicionada com Sucesso!!!");
            }
        }
    }

    public static void removerTarefa(ArrayList<Tarefa> lista) {
        Scanner input = new Scanner(System.in);
        listarTarefas(lista);
    
        System.out.print("\nQuantas tarefas deseja remover? ");
        int qtd = input.nextInt();
        input.nextLine();
    
        for (int i = 0; i < qtd; i++) {
            System.out.print("\nQual tarefa deseja remover?(Nome) ");
            String tarefa = input.nextLine();
            boolean isFind = false;
    
            for (int j = 0; j < lista.size(); j++) {
                if (tarefa.equals(lista.get(j).getNome())) {
                    System.out.print("\nTem certeza que deseja remover esta tarefa?(y/n) ");
                    char escolha = input.next().toLowerCase().trim().charAt(0);
                    input.nextLine();
    
                    if (escolha == 'y') {
                        lista.remove(j);
                        isFind = true;
                        System.out.println("\nRemovido com Sucesso!!!");
                        break;
                    }
                    isFind = true;
                }
                
            }
            
            if (!isFind) {
                System.out.println("Tarefa não encontrada!!!");
            }
        }

    }

    public static void listarEmOrdemAlfabetica(ArrayList<Tarefa> lista) {

        Collections.sort(lista);
        listarTarefas(lista);
    }

    public static void listarEmOrdemCronologica(ArrayList<Tarefa> lista)
    {
        lista.sort(Tarefa.COMPARATOR_BY_ID);
        listarTarefas(lista);
    }
    
}
