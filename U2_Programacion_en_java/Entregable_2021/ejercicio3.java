import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        System.out.println("introduce los números de la suerte");
        Scanner primerNumero = new Scanner(System.in);
        Scanner segundoNumero = new Scanner(System.in);
        Scanner tercerNumero = new Scanner(System.in);


        Scanner boleto = new Scanner(System.in);

        String primero = Integer.toString(primerNumero.nextInt());
        String segundo = Integer.toString(segundoNumero.nextInt());
        String tercero = Integer.toString(tercerNumero.nextInt());

        char primeroParseado = primero.charAt(0);
        char segundoParseado = segundo.charAt(0);
        char terceroParseado = tercero.charAt(0);

        System.out.println("Introduce el boleto");
        String LeeBoleto = Integer.toString(boleto.nextInt());


        int cuentaAciertos = 0;
        double medioBoleto = (double) LeeBoleto.length() / 2;


        for (int tamañoBoleto = 0; tamañoBoleto < LeeBoleto.length(); tamañoBoleto++) {
            if (LeeBoleto.charAt(tamañoBoleto) == primeroParseado || LeeBoleto.charAt(tamañoBoleto) == segundoParseado || LeeBoleto.charAt(tamañoBoleto) == terceroParseado) {
                cuentaAciertos++;
            }

        }
        if (cuentaAciertos >= medioBoleto) {

            System.out.println("Tienes Suerte");

        } else {
            System.out.println("No tienes Suerte");
        }
        ;


        primerNumero.close();
        segundoNumero.close();
        tercerNumero.close();
        boleto.close();

    }

}
