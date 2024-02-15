import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b;
        char escolha;
        Calculadora calculadora = new Calculadora();
        boolean ligado = true;

        while(ligado)
        {
            do {
                System.out.print("\nDigite um número: ");
                a = input.nextDouble();
    
                System.out.print("\nDigite o Operador: ");
                escolha = input.next().charAt(0);
    
                System.out.print("\nDigite um número: ");
                b = input.nextDouble();
    
                if(escolha != '+' && escolha != '-' && escolha != '*' && escolha != '/' && escolha != '^')
                {
                    System.out.println("\nDigite um operador válido porfavor!!!");
                }
            } while (escolha != '+' && escolha != '-' && escolha != '*' && escolha != '/' && escolha != '^');

            System.out.println("\nO resultado de " + a + " " + escolha + " " + b + " resulta em " + calculadora.calcular(a, b, escolha));
            System.out.println(" ");

            System.out.println("Deseja continuar calculando???");
            String resposta = input.next().toLowerCase().trim();

            if(resposta.equals("s") || resposta.equals("sim"))continue;
            ligado = false;
        }
        System.out.println("\n\tDeslingado a Calculadora...");
        
    }
}
