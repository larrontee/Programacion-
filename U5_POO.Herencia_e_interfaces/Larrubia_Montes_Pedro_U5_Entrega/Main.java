package tema5.prueba;

public class Main {
    public static void main(String[] args) {
        Baloncestista b = new Baloncestista("pedro", 20, (float) 1.85);
        Baloncestista b1 = new Baloncestista("b1", 20, (float) 1.85);
        Baloncestista b2 = new Baloncestista("b2", 20, (float) 1.85);
        Baloncestista b3 = new Baloncestista("b3", 20, (float) 1.85);

        Baloncesto baloncesto = new Baloncesto("Baloncesto", "mascareta", 6);
        Atletismo atletismo=new Atletismo("Atletismo", "pomporopom",4);
        Judo judo=new Judo("Judo","piripin",6);
        baloncesto.anadirparticipante(b);
        baloncesto.anadirparticipante(b2);
        baloncesto.anadirparticipante(b3);
        baloncesto.anadirparticipante(b1);
        System.out.println(baloncesto);
        b.encestar();

        baloncesto.eliminarparticipante(b);
        System.out.println(baloncesto);


        Pais pais =new Pais("ESPAÑA", 100);
        Pais pais1 =new Pais("Francia", 100);
        Pais pais2 =new Pais("Alemania", 100);
        Juegos olimpiadas=new Juegos(2000,"Barcelona");

        olimpiadas.anadirpais(pais);
        olimpiadas.anadirpais(pais1);
        olimpiadas.anadirpais(pais2);

        olimpiadas.anadirdeporte(baloncesto);
        olimpiadas.anadirdeporte(atletismo);
        olimpiadas.anadirdeporte(judo);

        System.out.println(olimpiadas);

        olimpiadas.mostrarpais_paraceremonia();


        olimpiadas.eliminardeporte(atletismo);
        olimpiadas.eliminardeporte(judo);
        olimpiadas.eliminarpais(pais1);

        System.out.println(olimpiadas);

        b.hacerjuramento();

        Judoka judoka=new Judoka("pepe",3000,2);
        judoka.hacerjuramento();
        judoka.lucahr();

        Atleta atleta=new Atleta("pepe",3000,"salto de longitd");
        atleta.hacerjuramento();
        atleta.correr();
    }

}
