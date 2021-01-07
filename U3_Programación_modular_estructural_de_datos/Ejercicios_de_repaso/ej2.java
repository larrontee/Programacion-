import javax.management.MBeanAttributeInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que, dado un número entero positivo, diga cuáles
son y cuánto suman los dígitos pares. Los dígitos pares se deben
mostrar en orden, de izquierda a derecha. Usa long en lugar de int
donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22

Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0

Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num;
        Integer digito;
        int suma=0;
        System.out.println("Por favor, introduzca un número entero positivo:");
        num=sc.nextLine();
        String[] vector =num.split("");


        System.out.print("Digitos pares: ");
        for (String i: vector) {
            digito = Integer.valueOf(i);

            if (digito % 2 == 0) {
                System.out.printf("%d ", digito);
                suma += digito;
            }
        }
        System.out.println("\nSuma de los dígitos pares:"+suma);

    }
}



// System.out.println(num.charAt(i));







