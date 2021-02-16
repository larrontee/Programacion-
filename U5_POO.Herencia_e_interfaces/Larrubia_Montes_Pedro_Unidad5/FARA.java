package com.company;

import java.util.Arrays;

public class FARA {
  CamionCajas[] cc;
  CamionPrenda[] cp;

    public FARA() {
        this.cc = new CamionCajas[0];
        this.cp = new CamionPrenda[0];
    }

    public CamionCajas[] getCc() {
        return cc;
    }

    public void setCc(CamionCajas[] cc) {
        this.cc = cc;
    }

    public CamionPrenda[] getCp() {
        return cp;
    }

    public void setCp(CamionPrenda[] cp) {
        this.cp = cp;
    }

    public void addcamioncaja(CamionCajas camionCajas){
        cc= Arrays.copyOf(cc,cc.length+1);
        cc[cc.length-1]=camionCajas;
    }

    public void addcamionprenda(CamionPrenda camionPrenda){
        cp= Arrays.copyOf(cp,cp.length+1);
        cp[cp.length-1]=camionPrenda;
    }

    @Override
    public String toString() {
        return "FARA{" +
                "cc=" + Arrays.toString(cc) +
                ",\"\\n\"+ cp=" + Arrays.toString(cp) +
                '}';
    }
}
