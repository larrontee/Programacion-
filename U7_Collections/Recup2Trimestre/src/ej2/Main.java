package ej2;

public class Main {
    public static void main(String[] args) {
        ClinicaCanina clinicaCanina=new ClinicaCanina();
        Medicina m= new Medicina("perrocetamol",1,1);
        Perro p1=new Perro(1,"01-01-2000","paco",2);
        Perro p2=new Perro(2,"01-01-2000","pepe",2);
        Consulta consulta=new Consulta("01-01-2000","recien nacido");
        consulta.getMedicinas().add(m);


        clinicaCanina.addConsulta(p1,consulta);
        System.out.println(clinicaCanina);

        p2.addConsulta(consulta);
        clinicaCanina.getMapaPerros().put(p2.getPin(),p2);
        System.out.println(clinicaCanina);

        clinicaCanina.listaPerrosMedicina(m.getNombre());

        p1.removeConsulta(consulta);
        System.out.println(clinicaCanina);

        //clinicaCanina.guardarPerros();
        //clinicaCanina.cargarPerros();
    }
}
