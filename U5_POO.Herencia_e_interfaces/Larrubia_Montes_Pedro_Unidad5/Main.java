package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Conductor conductor1=new Conductor("paco","perez", "214125325");
        CamionCajas camionCajas1=new CamionCajas("qwerty",100,conductor1);
        CamionPrenda camionPrenda1=new CamionPrenda("fkm",100,conductor1);
        PrendaColgada prendaColgada1=new PrendaColgada(15,"pantalon","12345",5,1);
        Prenda prenda1=new Prenda(15,"camiseta","12345",5);
        Prenda prenda2=new Prenda(15,"bragas","12345",5);
        Prenda prenda3=new Prenda(15,"calcetines","12345",5);
        Prenda prenda4=new Prenda(15,"chaqueta","12345",5);
        Prenda prenda5=new Prenda(15,"gafas","12345",5);
        Prenda prenda6=new Prenda(15,"bañador","12345",5);
        FARA fara=new FARA();
        Caja caja1=new Caja();


        caja1.addPrenda(prenda1);
        caja1.addPrenda(prenda2);
        caja1.addPrenda(prenda3);
        caja1.addPrenda(prenda4);
        caja1.addPrenda(prenda5);
        System.out.println(caja1);

        caja1.addPrenda(prenda6);

        caja1.eliminarPrenda(prenda4);
        System.out.println(caja1);



        Caja caja2=caja1;
        Caja caja3=caja1;
        camionCajas1.addCaja(caja1);
        camionCajas1.addCaja(caja2);
        camionCajas1.addCaja(caja3);

        System.out.println(camionCajas1);

        camionCajas1.eliminarCaja(caja3);
        System.out.println(camionCajas1);

        camionCajas1.descargar();



        PrendaColgada prendaColgada2=prendaColgada1;
        PrendaColgada prendaColgada3=prendaColgada1;
        PrendaColgada prendaColgada4=prendaColgada1;
        camionPrenda1.addPrendaColgada(prendaColgada1);
        camionPrenda1.addPrendaColgada(prendaColgada2);
        camionPrenda1.addPrendaColgada(prendaColgada3);
        camionPrenda1.addPrendaColgada(prendaColgada4);
        System.out.println(camionPrenda1);

        camionPrenda1.eliminarPrendaColgada(prendaColgada4);
        System.out.println(camionPrenda1);

        camionPrenda1.descargar();

        prenda1.devolver();
        prenda1.doblar();

        prendaColgada1.devolver();
        prendaColgada1.doblar();
        prendaColgada1.colgar();

        CamionCajas cc2=camionCajas1;
        CamionCajas cc3=camionCajas1;
        CamionCajas cc4=camionCajas1;
        CamionCajas cc5=camionCajas1;
        fara.addcamioncaja(camionCajas1);
        fara.addcamioncaja(cc2);
        fara.addcamioncaja(cc3);
        fara.addcamioncaja(cc4);
        fara.addcamioncaja(cc5);

cc2.addCaja(caja1);
cc2.addCaja(caja2);
cc2.addCaja(caja3);

        fara.addcamionprenda(camionPrenda1);
        CamionPrenda cp2=camionPrenda1;
        CamionPrenda cp3=camionPrenda1;
        CamionPrenda cp4=camionPrenda1;
        CamionPrenda cp5=camionPrenda1;
        fara.addcamionprenda(cp2);
        fara.addcamionprenda(cp3);
        fara.addcamionprenda(cp4);
        fara.addcamionprenda(cp5);
cp2.addPrendaColgada(prendaColgada1);
cp2.addPrendaColgada(prendaColgada2);
cp2.addPrendaColgada(prendaColgada3);
cp2.addPrendaColgada(prendaColgada4);
        System.out.println(fara);
    }



}
