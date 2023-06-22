package aula_22_05;

public class peixe extends animal {

    String caracteristicas;

    public peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
            String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public void alteraCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String retornaCaracteristicas() {
        return this.caracteristicas;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Características: " + this.caracteristicas);
    }

}
