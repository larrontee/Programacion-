package ej2;

import java.io.*;
import java.nio.file.OpenOption;
import java.util.*;

public class ClinicaCanina {
    private Map<Integer,Perro> mapaPerros;

    public ClinicaCanina() {
        this.mapaPerros = new TreeMap<>();
    }

    public void addConsulta(Perro p, Consulta c){
        if (!mapaPerros.containsKey(p.getPin())){
            getMapaPerros().put(p.getPin(),p);
        }
        p.addConsulta(c);
        mapaPerros.replace(p.getPin(),p);
    }
    public void listaPerrosMedicina(String nombremedicina){
        List<Perro> listaperros =new ArrayList<>(mapaPerros.values());
        Medicina aux= new Medicina(nombremedicina,1,1);
        for (Perro p:listaperros) {
            for (Consulta c : p.getListaConsultas()) {
                if (c.getMedicinas().contains(aux)) {
                    System.out.println(p.getNombre());
                }
            }
        }
    }

    public void cargarPerros(){
        try {
            ObjectInputStream leer=new ObjectInputStream(new FileInputStream("perros.dat"));
            while (true){
                Perro p=(Perro)leer.readObject();
                mapaPerros.put(p.getPin(),p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarPerros(){
        try {
            ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream("perros.dat"));
            Collection<Perro> listaperros=(Collection<Perro>) mapaPerros.values();
            Iterator<Perro> it= listaperros.iterator();
            while (it.hasNext()){
                Perro p = it.next();
                writer.writeObject(p);
            }
            writer.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<Integer, Perro> getMapaPerros() {
        return mapaPerros;
    }

    public void setMapaPerros(Map<Integer, Perro> mapaPerros) {
        this.mapaPerros = mapaPerros;
    }

    @Override
    public String toString() {
        return "ClinicaCanina{" +
                "mapaPerros=" + mapaPerros +
                '}';
    }
}
