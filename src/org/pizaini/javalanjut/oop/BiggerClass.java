package org.pizaini.javalanjut.oop;

public class BiggerClass {
    public BiggerClass(){
    }

    public int terbesar(int x, int y){
        int t = x;
        if(y > x){
            t = y;
        }
        return t;
    }
}
