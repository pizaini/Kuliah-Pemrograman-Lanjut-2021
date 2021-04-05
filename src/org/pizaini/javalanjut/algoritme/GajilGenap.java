package org.pizaini.javalanjut.algoritme;

public class GajilGenap {
    private int bilangan;

    public GajilGenap() {
    }

    public GajilGenap(int bilangan) {
        this.bilangan = bilangan;
    }

    public int getBilangan() {
        return bilangan;
    }

    public void setBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    public boolean isGenap(){
        int hasil = this.bilangan % 2;
        if(hasil == 0){
            return true;
        }
        return false;
    }
}
