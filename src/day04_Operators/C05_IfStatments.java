package day04_Operators;

import java.util.Scanner;

public class C05_IfStatments {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin ucgen eskenar ise "eskenar ucgen" yazdirin

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini tam sayi giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("girilen ucgen bir eskenar ucgen");

        }


    }
}
