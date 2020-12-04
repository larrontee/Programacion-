package pruebatema3;
/*Realiza un programa que rellene un array de 5 filas por 9 columnas con
números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.*/


import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        int [][] vector= new int[5][9];
        int min=vector[0][0];
        int max=vector[0][0];
        for (int i = 0; i < vector.length ; i++) {
            for (int j = 0; j < 9 ; j++) {
                vector[i][j]=(int)(Math.random()*1001+(1001-100));

                if

            }
        }

        System.out.println(Arrays.deepToString(vector));
    }
}
