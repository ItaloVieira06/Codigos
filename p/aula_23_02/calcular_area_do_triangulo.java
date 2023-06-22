package aula_23_02;

import java.util.Scanner;

public class calcular_area_do_triangulo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo:");
        float num = ent.nextInt();
        System.out.println("Digite o comprimento da base do triângulo:");
        float num2 = ent.nextInt();
        float area = (num * num2) / 2;
        System.out.println("A área do triângulo é " + area);
    }
}
