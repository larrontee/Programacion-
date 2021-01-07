/*
Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y devuelva la unión de las dos matrices.
Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.
 */

import java.util.Arrays;

public class ej4 {
    public static void main(String[] args) {

    }
    public static String[][] unirMatrices(String[][] v1, String[][] v2){
        String[][] aux= new String[0][0];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                aux= Arrays.copyOf(aux,aux.length+1);
                aux[i]=v1[i];
                aux= Arrays.copyOf(aux,aux.length+1);

            }
        }
        return aux;
    }
}
