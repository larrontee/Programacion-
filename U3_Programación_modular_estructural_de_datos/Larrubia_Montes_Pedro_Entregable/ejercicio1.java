package pruebatema3;

import java.beans.XMLEncoder;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longituda;
        int longitudb;

        System.out.println("introduce la longitud del vector a");
        longituda = sc.nextInt();
        int[] vectora = new int[longituda];

        System.out.println("introduce la longitud del vector b");
        longitudb = sc.nextInt();
        int[] vectorb = new int[longitudb];


        for (int i = 0; i < vectora.length; i++) {
            vectora[i] = sc.nextInt();
        }

        for (int i = 0; i < vectorb.length; i++) {
            vectorb[i] = sc.nextInt();
        }



    }

    public static int[] mezcla(int[] a,int[] b) {
        int[] ab = new int[a.length + b.length];

        for (int i = 0; i < (ab.length); i++) {

       }
        System.out.println(Arrays.toString(ab));

        return mezcla();
    }

}