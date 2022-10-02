package day08_switchStatments_StringManipulations;

import java.util.Scanner;

public class C09_equalsIgnoreCase {
    public static void main(String[] args) {

        /*
        equalsIgnoreCase() methodu verilen iki Stringin metinsel esitligine buyuk-kucuk
        harf hassasiyeti olmadan bakar
         */

        String isim1 = "Kadir" ;
        String isim2 = "kadir" ;
        String isim3 = "Kadir " ;

        System.out.println(isim1.equals(isim2)); // false
        System.out.println(isim1.equalsIgnoreCase(isim2)); // true
        System.out.println(isim1.equals(isim3)); // false
        System.out.println(isim1.equalsIgnoreCase(isim3)); // false

         /*
        Kullanicidan gun ismi akin ve girilen gun ismine gore hafta ici veya hafta sonu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.next();

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba") ||
                gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma") ) {
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Hafta Sonu");
        } else System.out.println("Gecersiz Gun Ismi");





    }
}
