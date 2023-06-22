package aula_17_04;

public class principal {
    public static void main(String[] args) {
        carro c1 = new carro();

        c1.imprimir();

        c1.modelo = "corsa";
        c1.ano = 2020;
        c1.cor = "preto";
        c1.montadora = "Ford";
        c1.velocidade = 0;

        c1.imprimir();

        carro c2 = new carro("Corsa", "Preto", "Ford", 2020);

        c2.imprimir();
    }
}
