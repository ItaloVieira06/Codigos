package aula_22_05;

public class animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade);
    }

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getcomprimento() {
        return this.comprimento;

    }

    public void setcomprimento(double comprimento) {
        this.comprimento = comprimento;

    }

    public int getpatas() {
        return this.patas;
    }

    public void setpatas(int patas) {
        this.patas = patas;
    }

    public String getcor() {
        return this.cor;
    }

    public void setcor(String cor) {
        this.cor = cor;

    }

    public String getambiente() {
        return this.ambiente;
    }

    public void setambiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getvelocidade() {
        return this.velocidade;
    }

    public void setvelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
