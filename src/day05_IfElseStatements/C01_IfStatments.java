package day05_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatments {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse "sinifi gectin" 50 den kucukse
        "MALESEF KALDIN" yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >=50) {
            System.out.println("sınıfı geçtin");
        }
        if (not< 50) {
            System.out.println("Malesef Kaldin");
        }
    }
}
