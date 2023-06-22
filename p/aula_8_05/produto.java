package aula_8_05;

public class produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public void mostrarFruta() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço Custo: " + precoCusto);
        System.out.println("Preço Venda: " + precoVenda);
        System.out.println("Margem Lucro: " + margemLucro);
    }

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getprecoVenda() {
        return this.precoVenda;
    }

    public void setprecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getprecoCusto() {
        return this.precoCusto;
    }

    public void setprecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getmargemLucro() {
        return this.margemLucro;
    }

    public void setmargemLucro(double margemLucro, double precoCusto, double precoVenda) {

        this.margemLucro = margemLucro;
    }
}
