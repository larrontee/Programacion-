import java.util.Arrays;
import java.util.Scanner;

/*
Crea dos funciones que trabajen com arrays de dos dimensiones:

int[][] eliminarFilasPares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas pares
int[][] eliminarFilasImpares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas impares

Ejemplo: Dada la siguiente matriz
12 23 45 56
11 11 99 69
28 75 90 10
21 56 32 33

El resultado de eliminarFilasPares será:
11 11 99 69
21 56 32 33
El resultado de eliminarFilasImpares será:
12 23 45 56
28 75 90 10
NOTA: PARA SIMPLIFICAR SUPONDREMOS QUE LA MATRIZ RECIBIDA TIENE SIEMPRE UN NÚMERO PAR DE FILAS


 */


public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce las filas");
        int filas=sc.nextInt();
        System.out.println("introduce las columnas");
        int columnas=sc.nextInt();
        int [][] vector=new int[filas][columnas];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j]=(int)(Math.random()*(100-1)+1);
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
        System.out.println("eliminar filas impares");
        System.out.println(Arrays.toString(eliminarFilasImpares(vector)));
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        boolean filaimpar=true;
        int[][]vectorimpar=new int[matriz.length/2][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            if ((i+1)%2==0){
                filaimpar=false;
                break;
            }
            for (int j = 0; j < matriz[0].length; j++) {
                vectorimpar[i][j]=matriz[i][j];
            }
        }

        return vectorimpar;
    }
}




