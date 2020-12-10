/*
Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve
una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”.

Usar dicha función en el método main mostrando el resultado por pantalla.
 */


import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce la longituda del vector");
        int longitud=sc.nextInt();
        int[] vector=new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(vector));

        System.out.println(Arrays.toString(vector));

    }


}
