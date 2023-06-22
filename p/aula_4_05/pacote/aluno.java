package aula_4_05.pacote;

public class aluno {

    int matricula;
    String nome;
    int idade;
    char sexo;
    String cpf;

    public aluno() {
    }

    public aluno(String nome, int idade, int matrícula, char sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matrícula;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public aluno(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;

    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }

    /*
     * get = retorna
     * public int getnome(){
     * this.nome;
     * }
     * set = altera
     * public void setnome(String nome){
     * this.nome = nome;
     * }
     * 
     */
}
