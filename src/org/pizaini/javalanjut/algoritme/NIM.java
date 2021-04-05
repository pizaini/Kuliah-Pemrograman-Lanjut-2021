package org.pizaini.javalanjut.algoritme;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "LAKI-LAKI";
        }else if(kodeJk == '2'){
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }
}
