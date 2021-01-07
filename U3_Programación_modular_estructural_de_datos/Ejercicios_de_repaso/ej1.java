import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que lea un número n e imprima una pirámide de
números con n filas como en la siguiente figura:
    1
   121
  12321
 1234321
123456789
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int contador=0;
        System.out.println("cuantas filas quieres que tenga la piramide");
        int filas= sc.nextInt();
        for (int i = 0; i < filas; i++) {
            contador=0;
            for (int j = 0; j < (filas*2)-1; j++) {
                if (i+j<((filas*2)-1)/2 || j-i>((filas*2)-1)/2 ){
                    System.out.print(" ");;

                } else {
                    if (j<filas){
                        contador ++;
                        System.out.print(contador);
                    }else {
                        contador --;
                        System.out.print(contador);
                    }
                }
            }
            System.out.println();
        }
    }
}
