import java.util.Comparator;

public class Tarefa implements Comparable<Tarefa>{

    private static int contagemID = 0;

    private String nome;
    private String tipo;
    private String local;
    private int ID;

    public Tarefa(String nome, String tipo, String local)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.local = local;
        this.ID = contagemID++;
    }


    public String mostraTarefa()
    {
        String result;
        result = String.format( "ID:...........: %d\n", ID) +
        String.format( "Nome da terefa: %s\n", nome) +
        String.format("Tipo da tarefa: %s\n", tipo) + 
        String.format("Descrição.....: %s\n", local);
        
        return result;
    }

    public int getId() {
        return ID;
    }

    public String getNome()
    {
        return nome;
    }

    //aqui ele ordena em ordem alfabetica utilizando o nome como parametro na comparacao
    @Override
    public int compareTo(Tarefa other) {
        int compareInt = this.nome.compareTo(other.nome);
        if(compareInt < 0) return -1;
        if(compareInt > 0)return 1;
        return 0;
    }

    //aqui ele ordena pelo ID, portanto, ordenando de forma cronológica
    public static final Comparator<Tarefa> COMPARATOR_BY_ID = Comparator.comparing(Tarefa::getId);

}
