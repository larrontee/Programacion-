import java.util.Scanner;

/*
Crea una función llamada palabraAhorcado que reciba como parámetros dos
cadenas (la cadena a adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar.
Debe devolver el resultado de encontrar ese caracter en la cadena a adivinar.

Por ejemplo:
palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--o-"
palablraAhorcado("hola","----",'x') debe devolver "----"
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("palabra a adivinar");
        String palabra= sc.nextLine();
        System.out.println("introduce el intento;");
        String intento= sc.nextLine();
        System.out.println("introduce la letra que debe buscar;");
        String letra=sc.nextLine();

        System.out.println("palabra a adivinar "+palabra+" ha buscado la letra "+letra+" ha encontrado"+palabraAhorcado(palabra,intento,letra));

    }
    public static String palabraAhorcado (String solucion,String resultadoparcial, String caracter){
        String demostracion="";
        for (int i = 0; i < solucion.length(); i++) {
            if (solucion.charAt(i)==caracter.charAt(0)){
                demostracion+=Character.toString(solucion.charAt(i));
            } else{
                demostracion+=Character.toString(resultadoparcial.charAt(i));;
            }

        }
        return demostracion;
    }
}
