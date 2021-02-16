/*
Realiza un programa que pida 10 números por teclado y que los almacene
en un array. A continuación, se mostrará el contenido de ese array
junto al índice (0 – 9) utilizando para ello una tabla. Seguidamente
el programa pasará los primos a las primeras posiciones, desplazando
el resto de números (los que no son primos) de tal forma que no se
pierda ninguno. Al final se debe mostrar el array resultante.
Por ejemplo:
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce 10 numeros");
        int[] vector= new int[10];
        int numsig=0,numant=0,ultimoprimo=0;
        boolean primo;

        for (int i = 0; i < vector.length ; i++) {
            vector[i]=sc.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            primo=true;
            for (int j = 2; j < vector[i]; j++) {
                if (vector[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo){
                for (int j = ultimoprimo; j <=i ; j++) {
                    if (j==ultimoprimo){
                        numant=vector[j];
                        vector[j]=vector[i];
                    }
                    else {
                        numsig=vector[j];
                        vector[j]=numant;
                        numant=numsig;
                    }
                }
                ultimoprimo++;

            }
        }
        System.out.println(Arrays.toString(vector));
    }
}










