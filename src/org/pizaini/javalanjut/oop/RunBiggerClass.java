package org.pizaini.javalanjut.oop;

import java.util.Scanner;

public class RunBiggerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai X: ");
        int x = scanner.nextInt();

        System.out.print("Nilai Y: ");
        int y = scanner.nextInt();

        BiggerClass biggerClass = new BiggerClass();
        int terbesar = biggerClass.terbesar(x, y);
        System.out.println("Nilai terbesar dari BiggerClass adalah "+terbesar);
    }
}
