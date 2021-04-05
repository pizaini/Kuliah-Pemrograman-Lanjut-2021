package org.pizaini.javalanjut.algoritme;

public class NIMRun {
    public static void main(String[] args) {
        String nim = "12050116400";
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
    }
}
