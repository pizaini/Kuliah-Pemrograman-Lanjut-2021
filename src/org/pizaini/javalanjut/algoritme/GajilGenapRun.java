package org.pizaini.javalanjut.algoritme;

import java.util.Scanner;

public class GajilGenapRun {
    public static void main(String[] args) {
        GajilGenap gajilGenap = new GajilGenap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        int bilangan = scanner.nextInt();
        gajilGenap.setBilangan(bilangan);
        System.out.println("IS GENAP? "+gajilGenap.isGenap());
    }
}
