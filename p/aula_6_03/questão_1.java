package aula_6_03;

import java.util.Scanner;

public class questão_1 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Digite a senha necessária para o acesso:");
        int senha = let.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }
}
