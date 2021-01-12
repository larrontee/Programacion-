import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

/*
Realiza un programa que nos diga cuántos dígitos tiene un número
entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
Ejemplo:
Introduce el número:
123
El número cierto 123 tienen 3 dígitos
Introduce el número
-2222
El número -2222 tiene 4 dígitos.
NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador=0;

        System.out.println("Introduce el número:");
        int num=sc.nextInt();





        System.out.println("El número cierto"+num+"tiene "+contador+" digitos");
    }
}
