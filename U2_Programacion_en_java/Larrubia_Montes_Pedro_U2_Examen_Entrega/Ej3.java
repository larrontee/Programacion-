package sample;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 0;

        System.out.println("Introduce la altura del reloj");
        tam = sc.nextInt();
        while (tam < 3 || tam % 2 == 0) {
            System.out.println("Introduce la altura del reloj");
            tam = sc.nextInt();
        }
        for (int i = 0; i==tam ; i++) {
            System.out.println("*");

        }

    }
}

