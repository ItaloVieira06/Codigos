package aula_2_03;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma primeira nota:");
        double num = leitura.nextDouble();
        System.out.println("Digite uma segunda nota:");
        double num2 = leitura.nextDouble();
        double media = (num + num2) / 2;
        System.out.println("A sua media foi: " + media);
        if (media < 6) {
            System.out.println("Você é um fracassado");
        } else {
            System.out.println("Você é fodinha");
        }
    }
}
