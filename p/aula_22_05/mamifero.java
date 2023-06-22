package aula_22_05;

public class mamifero extends animal {

    String alimento;

    public mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
            String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String retornaAlimento() {
        return this.alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + this.alimento);
    }
}
