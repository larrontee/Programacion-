/*
Define la función esta  con la siguiente cabecera:
public static boolean esta(int[] vector, int num)
Que nos devuelva si un elemento está en un vector(array) unidimensional.
Usar dicho elemente para construir la siguiente función:
public static int[] unirSinRepetidos(int v1[],int[] v2)
Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método main mostrando el vector resultado por pantalla.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("longitud vector");
        int longitud=sc.nextInt();
        int[] vector1=new int[longitud];
        int[] vector2=new int[longitud];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(vector1));
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(vector2));
        unirSinRepetidos(vector1,vector2);

    }
    public static boolean esta(int[] vector, int num){
        for (int i = 0; i < vector.length; i++) {
            if (num!=vector[i]){
                return true;
            }
        }
        return false;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] aux= new int[0];
        int num;
        for (int i = 0; i < (v1.length); i++) {

            aux=Arrays.copyOf(aux, aux.length+1);
            aux[i]=v1[i];
        }
        for (int i =0; i < (v2.length); i++) {

            aux=Arrays.copyOf(aux, aux.length+1);
            aux[(v1.length-1)+1+i]=v2[i];
        }
        System.out.println(Arrays.toString(aux));


        return aux;
    }
}
