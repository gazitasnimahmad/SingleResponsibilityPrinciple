package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Magazine magazine = new Magazine(new MagazineFormatter(), new MagazinePrinter());
        magazine.getMagazineFormatter().format();
        magazine.getMagazinePrinter().Printer();
    }
}
