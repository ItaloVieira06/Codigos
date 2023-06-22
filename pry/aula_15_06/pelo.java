package aula_15_06;

public abstract class pelo {

    public static void main(String[] args) {

        gerente Daniel = new gerente(1500, 1500);
        Daniel.setSalario(1500);

        System.out.println("Salário do gerente: " + Daniel.getBonificacao());

        garcom Davi = new garcom(1320, 2200);
        Davi.setSalario(1320);
        System.out.println("Salario do Garçom: " + Davi.getBonificacao());

    }
}
