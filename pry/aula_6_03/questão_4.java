package aula_6_03;

import java.util.Scanner;

import java.text.DecimalFormat;

public class questão_4 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Qual o seu sexo?(Digite 1 pra homem e 0 pra mulher)");
        int sexo = let.nextInt();
        System.out.println("Qual sua altura?");
        double altura = let.nextDouble();
        if (sexo == 1) {
            double homem = (altura * 72.7) - 58;
            System.out.println("Seu peso ideal é: " + homem);
        } else {
            double mulher = (altura * 62.1) - 44.7;
            System.out.println("Seu peso ideal é: " + mulher);
        }
    }
}
