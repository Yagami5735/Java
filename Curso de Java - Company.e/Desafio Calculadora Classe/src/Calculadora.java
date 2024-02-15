import java.lang.Math;

public class Calculadora {
    private double a, b, resultado;
    private char escolha;


    //metodos

    public double calcular(double a, double b, char escolha){
        this.a = a;
        this.b = b;
        this.escolha = escolha;

        switch (escolha) {
            case '+':
                soma(a, b);
                return resultado;
            
            case '-':
                subtracao(a, b);
                return resultado;
            
            case '*':
                multiplicacao(a, b);
                return resultado;

            case '/':
                divisao(a, b);
                return resultado;

            case '^':
                potencia(a, b);
                return resultado;

            default:
                return resultado;
        }

    }

    private void soma(double a, double b)
    {
        resultado = a+b;
    }

    private void subtracao(double a, double b)
    {
        resultado = a-b;
    }

    private void multiplicacao(double a, double b)
    {
        resultado = a*b;
    }

    private void divisao(double a, double b)
    {
        resultado = a/b;
    }
    
    private void potencia(double a, double b)
    {
        resultado = Math.pow(a, b);
    }

    
}
