package aula_16_06;

public abstract class calculadora {

    public double int1;
    public double int2;
    public double soma;
    public double sub;
    public double mult;
    public double div;

    public calculadora(double int1, double int2) {

        this.int1 = int1;
        this.int2 = int2;

    }

    public void mostrarcalculadora(double int1, double int2, double soma, double sub, double mult, double div) {

        System.out.println("Somando: " + soma);
        System.out.println("Subtrair: " + sub);
        System.out.println("Multiplicar: " + mult);
        System.out.println("Dividir: " + div);

    }

    public double soma(double int1, double int2, double soma) {
        return soma = int1 + int2;
    }

    public double sub(double int1, double int2, double sub) {
        return sub = int1 - int2;
    }

    public double mult(double int1, double int2, double mult) {
        return mult = int1 * int2;
    }

    public double div(double int1, double int2, double div) {
        return div = int1 / int2;
    }

}
