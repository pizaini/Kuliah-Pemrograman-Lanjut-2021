package org.pizaini.javalanjut.oop;

public class RunBuku {
    public static void main(String[] args) {
        //Instance --> membuat Object
        Buku buku = new Buku("0987654321", 2019);
        System.out.println("Tahun buku = "+buku.getTahun());
        System.out.println("ISBN = "+buku.getIsbn());
    }
}
