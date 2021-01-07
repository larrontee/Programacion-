import java.util.Arrays;

/*


Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. El array que contiene
los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se
deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
 Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array
  de países (no se pueden escribir directamente).
 */
public class ej3 {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] altura=new int[4][10];
        int media=0;
        int valor=0;
        int min=0;
        int max=0;

        for (int i = 0; i < altura.length; i++) {
            for (int j = 0; j < altura[0].length; j++) {
               altura[i][j]=(int)(Math.random()*211);

                valor=(valor+=altura[i][j]);
                media=valor/altura[0].length;

                if (max<altura[i][j]){
                    max=altura[i][j];
                    max=max;
                }
                if (min>altura[i][j]){
                    min=altura[i][j];
                    min=min;
                }



            }
            System.out.println(pais[i]+Arrays.toString(altura[i])+" media:"+media+" min:"+min+" max:"+max);
        }
    }
}
