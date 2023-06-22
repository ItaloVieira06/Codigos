package aula_6_03;

import java.util.Scanner;

public class questão_3 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Qual o dia do seu nascimento?");
        int dd = let.nextInt();
        System.out.println("Qual o mês do seu nascimento?");
        int mm = let.nextInt();
        System.out.println("Qual o ano do seu nascimento?");
        int aaaa = let.nextInt();

        if (dd > 0 && dd < 31) {
            if (mm > 0 && mm < 12) {
                if (aaaa > 0 && aaaa < 2023) {
                    System.out.println("DATA VÁLIDA");
                } else {
                    System.out.println("DATA INVÁLIDA");
                }
            } else {
                System.out.println("DATA INVÁLIDA");
            }
        } else {
            System.out.println("DATA INVÁLIDA");
        }
    }

}
