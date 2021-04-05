package org.pizaini.javalanjut.algoritme;

import java.util.Scanner;

public class GanjilGenapRun2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        int bilangan = scanner.nextInt();

        GajilGenap ganjilGenap = new GajilGenap(bilangan);
        System.out.println("Is genap? "+ganjilGenap.isGenap());
    }
}
