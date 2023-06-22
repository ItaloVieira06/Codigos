package aula_4_05.pacote;

public class principal {
    public static void main(String[] args) {

        aluno a1 = new aluno();

        aluno a2 = new aluno("Miguel", "123.456.789-00", 226730);

        aluno a3 = new aluno("Tauan", 16, 224034, 'M', "987.456.321-11");

        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();

    }
}