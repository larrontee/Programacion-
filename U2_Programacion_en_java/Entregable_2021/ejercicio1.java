import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de los calcetines");
        int tam = sc.nextInt();
        if (tam >= 4) {


            int i = 0;

            while (i < tam) {
                System.out.println("***     ***");
                if (i == tam - 2) {
                    System.out.println("******  ******");
                    System.out.println("******  ******");
                    break;
                }

                i = i + 1;

            }
        } else {
            System.out.println("el tamaño debe ser mayor que 4");


        }
        sc.close();
    }
}