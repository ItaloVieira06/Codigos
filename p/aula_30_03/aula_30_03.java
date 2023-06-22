package aula_30_03;

public class aula_30_03 {

    String nome;
    String endereço;
    int idade;
    Float salário;

    public float aumento1(float vlraumento) {
        vlraumento = (salário * 10 / 100);
        salário = salário + vlraumento;
        return salário;
    }

}
