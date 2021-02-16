import java.util.Scanner;

/*
Escribe un programa que pida un número entero positivo por teclado y
que muestre a continuación los 5 números consecutivos a partir del
número introducido. Al lado de cada número se debe indicar si se trata
de un primo o no.
Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo;
        System.out.println("Por favor, introduzca un número entero positivo");
        num= sc.nextInt();

        for (int i = 1; i <=5 ; i++) {
            System.out.println(num);
            for (int j = 2; j < num; j++) {
                if (num%j==0){
                    primo=false;
                } else {
                    primo=true;
                }

                System.out.println(primo);
            }
            num+=1;
        }

    }
}


 */
public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;
        System.out.println("Por favor, introduzca un número entero positivo");
        num= sc.nextInt();
        int rango= num+5;

        for (int i = num; i <rango; i++) {
            System.out.print(i);
            for (int j = 2; j<i; j++) {
                if (i%j==0){
                    primo=false;
                }
            }
            System.out.println(primo ? " es primo":" no es primo ");
            primo=true;
        }


        }

    }