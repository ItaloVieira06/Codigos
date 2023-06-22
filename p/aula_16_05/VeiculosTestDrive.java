package aula_16_05;

public class VeiculosTestDrive {
    public static void main(String[] args) {

        veiculo a = new veiculo("Volks", "Fox", 5, 0, "Branco");

        veiculo b = new veiculo("GM", "Spin", 7, 0, "Azul");

        a.mostrarCarro();
        b.mostrarCarro();
    }
}
