package aula_16_06;

public class cientifica extends calculadora {

    public double pot;
    public double raiz;

    public cientifica(double int1, double int2) {

        super(int1, int2);

    }

    public double raiz(double int1, double raiz) {
        return raiz = Math.sqrt(int1);
    }

    public double pot(double int1, double int2, double pot) {
        return pot = Math.pow(int1, int2);
    }

    public void mostrarcalculadora(double int1, double int2, double soma, double sub, double mult, double div,
            double raiz, double pot) {
        System.out.println("Somando: " + soma);
        System.out.println("Subtrair: " + sub);
        System.out.println("Multiplicar: " + mult);
        System.out.println("Dividir: " + div);
        System.out.println("Potência " + pot);
        System.out.println("Raiz " + raiz);

    }

    @Override
    public double soma(double int1, double int2, double soma) {
        return soma = int1 + int2;
    }

    @Override
    public double sub(double int1, double int2, double sub) {
        return sub = int1 - int2;
    }

    @Override
    public double mult(double int1, double int2, double mult) {
        return mult = int1 * int2;
    }

    @Override
    public double div(double int1, double int2, double div) {
        return div = int1 / int2;
    }
}