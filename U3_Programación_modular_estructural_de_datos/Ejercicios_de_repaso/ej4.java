import java.util.Scanner;

/*
Realiza un programa que pinte una X hecha de asteriscos. El programa
debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
*   *
 * *
  *
 * *
*   *
 */





















public class ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int altura;
        do {
            System.out.println("introduce la altura de la X, tiene que ser mayor o igual que 3 e impar");
            altura=sc.nextInt();
        } while (altura<3 || altura%2==0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==j || i+j==altura-1){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
