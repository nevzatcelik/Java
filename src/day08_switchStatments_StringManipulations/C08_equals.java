package day08_switchStatments_StringManipulations;

import java.util.Scanner;

public class C08_equals {
    public static void main(String[] args) {

        /*
        Kullanicidan gun ismi akin ve girilen gun ismine gore hafta ici veya hafta sonu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next();
        String gun= gunIsmi.toLowerCase();
         if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals("persembe") || gun.equals("cuma") ) {
             System.out.println("Hafta ici");
         } else if (gun.equals("cumartesi") || gun.equals("pazar")) {
             System.out.println("Hafta Sonu");
         } else System.out.println("Gecersiz Gun Ismi");


    }
}
