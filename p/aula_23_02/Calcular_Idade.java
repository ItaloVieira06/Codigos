package aula_23_02;

import java.util.Scanner;

public class Calcular_Idade {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento:");
        int num = ent.nextInt();
        System.out.println("Diga o ano atual:");
        int num2 = ent.nextInt();
        int idade = num2 - num;
        System.out.println("Sua idade é " + idade + " anos.");
    }
}