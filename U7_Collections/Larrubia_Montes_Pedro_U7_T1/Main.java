package tema7.prueba;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IES alixar=new IES("alixar");
        Unidad daw1 =new Unidad("1daw");
        Alumno alumno1=new Alumno("ppe","ofa","1233124",daw1);
        Alumno alumno2=new Alumno("ppe","ofa","1233124",daw1);
        Alumno alumno3=new Alumno("ppe","ofa","1233124",daw1);


/*
    public void cargarAlumnos{
        try {
            ObjectInputStream leer =new ObjectInputStream(new FileInputStream("alumnos.dat"));
            do {
            leer.read(alixar.lista_clases);

            }while (true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        public void guardarAlumnos{
            try {
                ObjectOutputStream escribir =new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
                escribir.writeObject(alixar.lista_clases);
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/
    }
}
