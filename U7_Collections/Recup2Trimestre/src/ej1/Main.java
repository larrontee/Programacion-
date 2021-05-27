package ej1;

public class Main {
    public static void main(String[] args) {
        AltavozTV tv=new AltavozTV(1,1,4,TipoInterfaz.IR);
        AltavozEmpotrable altavozEmpotrable= new AltavozEmpotrable(2,20,2,EmpotradoEn.SALPICADERO);
        AltavozTrasero altavozTrasero=new AltavozTrasero(3,40,20,1000,true);
        AltavozMovil movil=new AltavozMovil(4,5,6,2);
        Revision r1=new Revision("10-01-2000",true,100);
        Revision r2=new Revision("10-01-2001",false,200);

        System.out.println(Altavoz.numAltavocesCreados());

        tv.addReview(r1);
        tv.addReview(r2);
        System.out.println(tv);
        tv.mostrarRevisiones(tv);


        System.out.println(tv.delReview(r1));
        System.out.println(tv);


    }
}
