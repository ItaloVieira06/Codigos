package aula_13_03;

import java.util.Scanner;

public class questão_1 {
    public static void main(String[] args) {

        Scanner let = new Scanner(System.in);
        prontuario p = new prontuario();

        System.out.println("Digite o nome do paciente: ");
        p.nome = let.nextLine();
        System.out.println("Digite o a data de nascimento do Paciente: ");
        p.dataNasc = let.nextLine();
        System.out.println("Digite o peso do paciente: ");
        p.peso = let.nextFloat();
        System.out.println("Digite a altura do paciente: ");
        p.altura = let.nextFloat();

        float imc = p.peso / (p.altura * p.altura);

        p.danielbombado();
        System.out.println("O IMC do paciente é: " + imc);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");

        }
        if (18.5 < imc && imc < 24.9) {
            System.out.println("Você está no peso");

        }
        if (25 < imc && imc < 29.9) {
            System.out.println("Você está com sobrepeso");

        }
        if (30 < imc && imc < 34.9) {
            System.out.println("Você está com obesidade grau I");

        }
        if (35 < imc && imc < 39.9) {
            System.out.println("Você está com obe.sidade grau II");

        } else {
            System.out.println("Você está com obesidade mórbida");
        }
    }

}
