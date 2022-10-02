package calismalarsweden01;

import java.util.Scanner;

public class P02_SwitchCaseSORUSU {
    public static void main(String[] args) {

        // 2- switch case den kullanici gün adini girince
        // "calisma günü veya tatil veya gecersiz gün girdiniz" yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String girilenGun=scan.nextLine();
        String gunIsmi=girilenGun.toLowerCase();




        switch (gunIsmi) {

            case "pazartesi" :
            case "sali" :
            case  "carsamba":
            case  "persembe:":
            case  "cuma":
                System.out.println("Girilen gun " + girilenGun + " calismaya devam");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Girilen gun " + girilenGun + " tatil gunu ");
                break;
            default:
                System.out.println("Girilen gun ismi hatali");

        }





    }
}
