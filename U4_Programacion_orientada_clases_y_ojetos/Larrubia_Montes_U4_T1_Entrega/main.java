package tema4.prueba;

import javax.xml.transform.Templates;
import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Empleado emp1=new Empleado("pepe perez","23232323","666666666");
        Empleado emp2=new Empleado("pablo garcia","0987676","34567866");
        Empleado emp3=new Empleado("pedro perez","0982430","009099996");
        Empleado emp4=new Empleado("oscar casanova","11111111","777776");
        Empleado emp5=new Empleado("gonzalo whack","88787878","887575498");
        Empleado emp6=new Empleado("alicia acosta","00990930943","8348454");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        System.out.println(emp6);

        Departamento depart1= new Departamento("informatica","+34");
        Departamento depart2= new Departamento("textil","Tomares","+34");
        Departamento depart3= new Departamento("humano","Tomares","+34");
        System.out.println(depart1);
        System.out.println(depart2);
        System.out.println(depart3);

        Empresa emp=new Empresa("dell");
        System.out.println(emp);
    }
}
