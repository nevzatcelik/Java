package day08_switchStatments_StringManipulations;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // SORU:6 Kullanicidan bir ay ismini alip mevsimi yazidirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir Ay ismini giriniz");
        String girilenayIsmi= scan.next();

        /* Kullanici ay isimini farkli sekillerde yazabilecegi icin biz girilen
        degeri standartlastirmak icin yeni bir varibale a kucuk harf olarak atayalim
         */
        String ayIsmi= girilenayIsmi.toLowerCase();

        switch (ayIsmi) {
            case "aralik" :
            case "ocak":
            case "subat":
                System.out.println("Girdiginiz " + girilenayIsmi + " ayi kis mevsiminde");
                break;
            case "mart":
            case "nisan" :
            case "mayis":
                System.out.println(" Girdiginiz " + girilenayIsmi + " Ilkbahar mevsiminde");
                break;
            case "haziran" :
            case "temmuz":
            case "agustos":
                System.out.println("Girdiginiz " + girilenayIsmi + " Yaz mevsiminde");
                break;
            case "eylul" :
            case"ekim":
            case"kasim":
                System.out.println("Girdiginiz " + girilenayIsmi + " Sonbahar mevsiminde");
                break;

            default:
                System.out.println("Gecersiz bir AY ismi girdiniz");


        }
    }
}
