package aula_6_03;

import java.util.Scanner;

public class questão_5 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Digite o número de lados de algum polígono:");
        int lados = let.nextInt();

        if (lados < 3) {
            System.out.println("Não é um polígono!");
        }
        if (lados > 5) {
            System.out.println("Polígono não indentificado!");
        } else {
            System.out.println("Belo Polígono!");
        }
    }
}
