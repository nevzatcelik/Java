package day07_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise "eskenar ucgen" degilse "eskenar degil" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
         int kenar1= scan.nextInt();
         int kenar2= scan.nextInt();
         int kenar3= scan.nextInt();

        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 ? "Eskenar ucgen " : "Eskenar Degil");

    }
}
