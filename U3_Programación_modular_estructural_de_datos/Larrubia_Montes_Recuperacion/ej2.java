import java.util.Scanner;

/*
Realizar un programa que pinte una pirámide maya. 
Por los lados, se trata de una pirámide normal y corriente.
Por el centro se van pintando líneas de asteriscos de forma 
alterna (empezando por la superior): la primera se pinta, la segunda no,
la tercera sí, la cuarta no, etc. La terraza (la línea superior)  de la pirámide siempre tiene 
6 asteriscos, por tanto, las líneas centrales que se 
añaden a la pirámide normal tienen 4 asteriscos y el espacio entre 
las líneas que no se pintan tiene también 4 asteriscos.
Se solicitará al usuario la altura hasta que el usuario introduza una altura mayor o igual que 3.
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("altura");
        int altura= sc.nextInt();
        int ancho=6+((altura-1)*2);

        for (int i = 1; i <=altura; i++) {

            for (int j = 1; j <=ancho ; j++) {
                if (j<altura ){
                    if (i+j<=altura){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                if (j>altura+5){
                    if (j-i>=altura+5){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                }
                if (j>=altura && j<=altura+5){
                    if (i%2==0){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
