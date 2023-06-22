package aula_6_03;

import java.util.Scanner;

public class questão_2 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Quantas maçãs você quer comprar?:");
        double num = let.nextFloat();
        if (num >= 12) {
            double valor = num * 0.25;
            System.out.println("Você deve pagar:" + valor);
        } else {
            double valor = num * 0.30;
            System.out.println("Você deve pagar:" + valor);
        }
    }
}
