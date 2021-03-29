package org.pizaini.javalanjut.oop;

import java.time.LocalDate;
import java.util.Date;

public class Buku {
    public Buku(){
        System.out.println("ini constructor default");
    }
    public Buku(String isbn){
        System.out.println("ini constructor dengan parameter string");
        this.isbn = isbn;
    }

    public Buku(String isbn, int tahun){
        System.out.println("Constructor + string + int");
        this.isbn = isbn;
        this.tahun = tahun;
    }

    /**
     * Method yang tidak mengembalikan apa-apa / VOID
     */
    public String getIsbn(){
        return this.isbn;
    }

    public int getTahun(){
        return this.tahun;
    }

    private String isbn;
    private int tahun;
}
