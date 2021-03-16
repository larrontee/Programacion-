import java.io.*;
import java.util.*;

public class Maraton {
    Scanner sc= new Scanner(System.in);

    Map<Integer ,Atleta> listacorredores;

    public Maraton() {
        this.listacorredores = new TreeMap<>();
    }

    public Map<Integer, Atleta> getListacorredores() {
        return listacorredores;
    }

    public void setListacorredores(Map<Integer, Atleta> listacorredores) {
        this.listacorredores = listacorredores;
    }

    public void cargarAtletas(){
        try {
            ObjectInputStream leer=new ObjectInputStream(new FileInputStream("maraton.dat"));
            while (true){
                leer.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarAtletas(){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream("maraton.dat"));
            Collection atletas=(Collection)listacorredores;
            Iterator iterator= atletas.iterator();
            while (iterator.hasNext()){
                escribir.writeObject(atletas);
            }
            escribir.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarParticipantesPorPais(String pais){
        List<Atleta> listapais=new ArrayList<>();
        List<Atleta> aux=new ArrayList<>();
        aux.addAll(listacorredores.values());
        for (int i = 0; i < aux.size(); i++) {

        }
    }

    public void inscribirAtleta(){
      Atleta atleta=new Atleta();
        System.out.println("Nombre");
      atleta.setNombre(sc.nextLine());
        System.out.println("Pais");
        atleta.setPais(sc.nextLine());
        System.out.println("categoria");
        System.out.println("1.SENIOR, 2.JUNIOR, 3.VETERANO");
        String cat= sc.nextLine();
            if (cat.equals("SENIOR")) {
                atleta.setCategoria(Categoria.SENIOR);
            }else if (cat.equals("JUNIOR")) {
                atleta.setCategoria(Categoria.JUNIOR);
            } else {
                atleta.setCategoria(Categoria.VETERANO);
            }
    if (!listacorredores.containsKey(atleta.getDorsal())){
        listacorredores.put(atleta.getDorsal(),atleta);
    }else {
        System.out.println("ya esta inscrito");
    }
    }
    public void mostrarListaPais(String patria){
        Atleta atleta = new Atleta();
        List<Atleta> atletaspais=new ArrayList<>();
        for (int i = 0; i < listacorredores.size(); i++) {
            if (listacorredores.containsValue(atleta.getPais())){
                atletaspais.add(listacorredores.get(i));
            }
        }
        System.out.println(atletaspais.size());
    }
    public void mostrarListaFinisher(){
        Atleta atleta = new Atleta();
        List<Atleta> atletasfinish=new ArrayList<>();
        for (int i = 0; i < listacorredores.size(); i++) {
            if (listacorredores.containsValue(atleta.isFinisher())){
                atletasfinish.add(listacorredores.get(i));
            }
        }
        atletasfinish.sort(Comparator.comparingInt(Atleta::getMarca));
        atletasfinish.toString();
    }

    public void guardarTiempo(Integer dorsal, int tiempo){
        if (listacorredores.containsKey(dorsal)){
        }else{
            System.out.println("ese dorsal no esta inscrito");
        }
    }
    public void borrarAtleta(Integer dorsal){
        if (listacorredores.containsKey(dorsal)){
            listacorredores.remove(dorsal);
        }else{
            System.out.println("ese dorsal no esta inscrito");
        }
    }

    public void mostrarmaraton(){
        System.out.println(listacorredores);
    }
    @Override
    public String toString() {
        return "Maraton{" +
                "listacorredores=" + listacorredores +
                '}';
    }
}
