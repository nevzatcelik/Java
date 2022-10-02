package day11_strinManupulation_forLoop;

import java.util.Scanner;

public class C03_Soru1 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumla alin.
        cumlede ev geciyorsa"home home sweet home" yazalim
        cumlede is geciyorsa" calismak guzeldir" yazalim
        ikisini de iceriyorsa "hem ev lazim hem is"
        hicbirini icermiyorsa "cok calisman lazim" yazdirin.
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
       String cumle=scan.nextLine();

       if (cumle.contains("ev") && cumle.contains("is")) {
           System.out.println("hem ev lazim hem is");
       } else if (cumle.contains("is")) {
           System.out.println("calismak guzeldir");
       } else if (cumle.contains("ev")) {
           System.out.println("home home sweet hom");
       } else {
           System.out.println("Cok calisman lazim");
       }



    }
}
