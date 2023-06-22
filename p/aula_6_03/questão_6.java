package aula_6_03;

import java.util.Scanner;

public class questão_6 {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        System.out.println("Diga a medida de um dos lados de um triângulo:");
        int lado1 = let.nextInt();
        System.out.println("Diga a medida de outro do outro lado do triângulo:");
        int lado2 = let.nextInt();
        System.out.println("Diga a medida do terceiro lado:");
        int base = let.nextInt();

        if (lado1 == lado2) {
            if (lado1 == base) {
                System.out.println("Seu Triângulo é um triângulo EQUILÁTERO");
            } else {
                System.out.println("Seu Triângulo é um triângulo ISÓCELES");
            }
        } else {
            System.out.println("Seu Triângulo é um triângulo ESCALENO");
        }
    }
}
