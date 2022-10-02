package calismalarsweden01;

import java.util.Scanner;

public class P01_nestedIfElseSorusu {
    public static void main(String[] args) {
         /*
        Soru 4- Kullanicidan gunun ismini girmesini isteyin,
        girilen gun hafta ici bir gun ise
        “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
         girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gunun ismini giriniz");
        String gunIsmi= scan.next();
        String gunIsmiKontrolIcin= gunIsmi.toLowerCase();


        if (gunIsmiKontrolIcin.equals("pazartesi")) System.out.println("Simdi calisma zamani tatile 5 gun var");
        if (gunIsmiKontrolIcin.equals("sali")) System.out.println("Simdi calisma zamani tatile 4 gun var");
        if (gunIsmiKontrolIcin.equals("carsamba")) System.out.println("Simdi calisma zamani tatile 3 gun var");
        if (gunIsmiKontrolIcin.equals("persembe")) System.out.println("Simdi calisma zamani tatile 2 gun var");
        if (gunIsmiKontrolIcin.equals("cuma")) System.out.println("Simdi calisma zamani tatile 1 gun var");
        if (gunIsmiKontrolIcin.equals("cumartesi") || gunIsmiKontrolIcin.equals("pazar")) {
            System.out.println("Simdi dinlenme zamani");
        }

    }
}
