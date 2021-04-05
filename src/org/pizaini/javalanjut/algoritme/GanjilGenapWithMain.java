package org.pizaini.javalanjut.algoritme;

import java.util.Scanner;

public class GanjilGenapWithMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        int hasil = bilangan % 2;
        if(hasil == 0){
            System.out.println("GENAP");
        }else{
            System.out.println("GANJIL");
        }
    }

}
