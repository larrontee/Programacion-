package sample;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cargo;
        int sueldo=0;
        int visita=0;
        int estadocivil=0;
        int IRPF=0;

        System.out.println("¿Que cargo tiene?");
        System.out.println("1=Prog_junior, 2=Prog_senior, 3=Jefe_proyecto");
        cargo=sc.nextInt();
        if (cargo==1){
            sueldo=960;
        } else if (cargo==2){
            sueldo=1200;
        } else {
            sueldo=1600;
        }
        System.out.println("Tu sueldo base es "+sueldo+ ".");

        System.out.println("¿Cuantos clientes has visitado?");
        visita=sc.nextInt();
        System.out.println("En total has visitado "+visita+" has ganado este mes de extra "+ (visita*30)+" euros.");
        System.out.println("Diganos su estado civil");
        System.out.println("1=Soltero o 2=Casado");
        estadocivil=sc.nextInt();
        if (estadocivil==1){
            IRPF=25;
        } else {
            IRPF=20;
        }

        System.out.println("Sueldo base = "+sueldo);
        System.out.println("Dietas = "+visita);
        System.out.println("-----------------");
        System.out.println("Sueldo bruto "+(sueldo+visita));
        System.out.println("Retencion del IRPF "+"("+IRPF+"%) "+((20*(sueldo+(visita*30)))/100));
        System.out.println("Sueldo  neto "+((sueldo+(visita*30))-((20*(sueldo+(visita*30)))/100)));

    }
}
