package org.pizaini.javalanjut.algoritme;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai X: ");
        int x = scanner.nextInt();

        System.out.print("Nilai Y: ");
        int y = scanner.nextInt();

        int t = x;

        if(y > x){
            t = y;
        }

        System.out.println("Nilai terbesar adalah "+t);
    }

    public int terbesar(int x, int y){
        int t = x;
        if(y > x){
            t = x;
        }
        return t;
    }
}
