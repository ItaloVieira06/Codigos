package aula_13_03;

public class questão_0 {
    public static void main(String[] args) {
        prontuario p = new prontuario();

        p.danielbombado();

        p.nome = "David";
        p.dataNasc = "20/09/2006";
        p.altura = 1.80f;
        p.peso = 90;

        p.danielbombado();

        p.nome = "Danael";
        p.dataNasc = "25/12/2006";
        p.altura = 1.70f;
        p.peso = 70;

        p.danielbombado();
    }
}
