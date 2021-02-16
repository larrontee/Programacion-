import java.util.Scanner;

/*
 Realiza un programa que pinte la letra U por pantalla hecha con
    asteriscos. El programa pedirá la altura. Fíjate que el programa
    inserta un espacio y pinta dos asteriscos menos en la base para
    simular la curvatura de las esquinas inferiores.
            Ejemplo 1:
    Introduzca la altura de la U: 5
            *       *
            *       *
            *       *
            *       *
              * * *
            ---------
    Ejemplo 2:
    Introduzca la altura de la U: 4
            *     *
            *     *
            *     *
              * *
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la U:");
        int altura = sc.nextInt();
        int ancho =(altura*2)-1 ;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (j==1 || j==ancho ||  i==altura){
                    if (j%2==0 || i+j==altura+1 || i+j==altura+ancho){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}