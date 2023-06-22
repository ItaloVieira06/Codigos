package aula_17_04;

public class carro {
    String modelo;
    String cor;
    String montadora;
    int ano;
    int velocidade;

    public int acelerar(int valorVelocidade) {
        velocidade = velocidade + valorVelocidade;
        return velocidade;
    }

    public void imprimir() {
        System.out.println("modelo:" + modelo);
        System.out.println("ano:" + ano);
        System.out.println("cor" + cor);
        System.out.println("montadora" + montadora);
        System.out.println("velocidade" + velocidade);
    }

    public carro(String modelo, String cor, String montadora, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.montadora = montadora;
        this.ano = ano;
    }

    public carro() {

    }
}
