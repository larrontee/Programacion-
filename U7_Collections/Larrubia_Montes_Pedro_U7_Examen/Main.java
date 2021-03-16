import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Maraton maraton=new Maraton();
        Atleta atleta1=new Atleta("pepe","España",5,Categoria.VETERANO,true,1);
        Atleta atleta2=new Atleta("LOLA","España",165,Categoria.VETERANO,true,2);
        Atleta atleta3=new Atleta("luis","España",153,Categoria.VETERANO,true,3);
        Atleta atleta4=new Atleta("juan","España",0,Categoria.VETERANO,false,4);
        Atleta atleta5=new Atleta("pedro","España",0,Categoria.VETERANO,false,5);
        Atleta atleta6=new Atleta("gonzalo","España",1435,Categoria.JUNIOR,true,6);
        Atleta atleta7=new Atleta("alicia","España",115,Categoria.JUNIOR,true,7);
        Atleta atleta8=new Atleta("oscar","España",20,Categoria.JUNIOR,true,8);
        Atleta atleta9=new Atleta("alvaro","España",15,Categoria.JUNIOR,false,9);
        Atleta atleta10=new Atleta("david","España",15,Categoria.JUNIOR,false,10);
        Atleta atleta11=new Atleta("fran","España",15,Categoria.SENIOR,true,11);
        Atleta atleta12=new Atleta("guille","España",15,Categoria.SENIOR,true,12);
        Atleta atleta13=new Atleta("josemi","España",5326
                ,Categoria.SENIOR,false,13);
        Atleta atleta14=new Atleta("raul","España",11234,Categoria.SENIOR,true,14);
        Atleta atleta15=new Atleta("angela","España",1111111,Categoria.SENIOR,true,15);
        maraton.listacorredores.put(atleta1.getDorsal(),atleta1);
        maraton.listacorredores.put(atleta2.getDorsal(),atleta2);
        maraton.listacorredores.put(atleta3.getDorsal(),atleta3);
        maraton.listacorredores.put(atleta4.getDorsal(),atleta4);
        maraton.listacorredores.put(atleta5.getDorsal(),atleta5);
        maraton.listacorredores.put(atleta6.getDorsal(),atleta6);
        maraton.listacorredores.put(atleta7.getDorsal(),atleta7);
        maraton.listacorredores.put(atleta8.getDorsal(),atleta8);
        maraton.listacorredores.put(atleta9.getDorsal(),atleta9);
        maraton.listacorredores.put(atleta10.getDorsal(),atleta10);
        maraton.listacorredores.put(atleta11.getDorsal(),atleta11);
        maraton.listacorredores.put(atleta12.getDorsal(),atleta12);
        maraton.listacorredores.put(atleta13.getDorsal(),atleta13);
        maraton.listacorredores.put(atleta14.getDorsal(),atleta14);
        maraton.listacorredores.put(atleta15.getDorsal(),atleta15);
        int opcion;
        do {
            System.out.println("""
                    Menu
                    1.Cargar Atletas
                    2.Guardar Atletas
                    3.Incribir Atleta
                    4.Guardar Tiempo
                    5.Borrar Atleta
                    6.MostrarListaFinishers
                    7.MostrarListaCategoria
                    8.ParticipantesPorPaís
                    9.Salir
                    """);
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    maraton.cargarAtletas();
                break;
                case 2:
                    maraton.guardarAtletas();
                break;
                case 3:
                    maraton.inscribirAtleta();
                break;
                case 4:

                break;
                case 5:
                    System.out.println("introduce el dorsal");
                    maraton.borrarAtleta(sc.nextInt());
                break;
                case 6:
                    maraton.mostrarListaFinisher();
                break;
                case 7:

                break;
                case 8:
                    System.out.println("elige el pais");
                    maraton.mostrarParticipantesPorPais(sc.nextLine());
                break;

            }
        }while (opcion!=9);


    }
}
