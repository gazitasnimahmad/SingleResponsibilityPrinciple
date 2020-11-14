package org.example;

public class Magazine {

    public Magazine(MagazineFormatter magazineFormatter, MagazinePrinter magazinePrinter) {
        this.magazineFormatter = magazineFormatter;
        this.magazinePrinter = magazinePrinter;
    }

    private MagazineFormatter magazineFormatter;
    private MagazinePrinter magazinePrinter;

    public MagazineFormatter getMagazineFormatter() {
        return magazineFormatter;
    }

    public MagazinePrinter getMagazinePrinter() {
        return magazinePrinter;
    }





}
