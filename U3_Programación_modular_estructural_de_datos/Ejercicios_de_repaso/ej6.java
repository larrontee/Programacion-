import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a
derecha empezando por el 1. Se recomienda usar long en lugar de int ya
que el primero admite números más largos. Suponemos que el usuario
introduce correctamente los datos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long num= sc.nextLong();
        System.out.println("Introduzca la posición dentro del número: ");
        int posicion = sc.nextInt();
        System.out.println("Introduzca el nuevo dígito: ");
        int cifra= sc.nextInt();

        String cadena=Long.toString(num);
        String cadena1="";

        cadena1=cadena.substring(0,posicion-1); //trozo de cadena
        cadena1+=cifra;
        cadena1+=cadena.substring(posicion);
        num=Long.parseLong(cadena1);   //pasar cadena a numero
        System.out.println(num);
    }
}