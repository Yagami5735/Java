import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int a, b;
        char escolha;

        System.out.print("Digite um Número: ");
        a = input.nextInt();

        System.out.print("Digite o Operador: ");
        escolha = (char) System.in.read();

        System.out.print("Digite outro Número: ");
        b = input.nextInt();

        if (escolha == '+') {
            System.out.print("\nA soma entre " + a + " e " + b + " resulta em " + (a + b));
        } 
        else if (escolha == '-') {
            System.out.print("\nA subtração entre " + a + " e " + b + " resulta em " + (a - b));
        } 
        else if (escolha == '*') {
            System.out.print("\nA multiplicação entre " + a + " e " + b + " resulta em " + (a * b));
        } 
        else if (escolha == '/') {
            System.out.print("\nA divisão entre " + a + " e " + b + " resulta em " + (a / b));
        } 
        else {
            System.out.print("\nDigite um operador vádilo por favor!!!");
        }

    }
}
