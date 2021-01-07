import java.util.Arrays;

/*
Realiza un programa que muestre por pantalla un array de 10 filas por
10 columnas relleno con números aleatorios entre 200 y 300. A
continuación, el programa debe mostrar los números de la diagonal que
va desde la esquina superior izquierda a la esquina inferior derecha,
así como el máximo, el mínimo y la media de los números que hay en esa
diagonal.
 */
public class ej7 {
    public static void main(String[] args) {
        int valor=0, media;
        int[][] vector= new int[10][10];
        int max = 0, min=0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j]=(int)(Math.random()*101)+200;
                if(i==j){
                    valor+=vector[i][j];

                    if (i==0){
                        max=vector[i][j];
                        min=vector[i][j];
                    } else {
                        if (max<vector[i][j]){
                            max=vector[i][j];
                        }
                        if (min>vector[i][j]){
                            min=vector[i][j];
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(vector[i]));
        }
        media=valor/10;
        System.out.println("MEDIA="+media);
        System.out.println("MAX="+max);
        System.out.println("MIN="+min);
    }
}
