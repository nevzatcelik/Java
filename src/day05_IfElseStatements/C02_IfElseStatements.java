package day05_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // soru 5- Kullanıcıdan notunu alın 50 veya daha buyukse "sınıfı gectın"
        // 50 den daha kucukse "malesef kaldın" yazdırın

        // eger if ile yazdıgımız bir kodda sadece 2 ihtimal varsa bu durumda if else cumleleri kullanırız
        // tanımdan anlayacagımız uzere sadece iki ihtimal vardır ve sadece iksinden birisi çalışır
        // ikisinin birden çalışma ihitmali ----YOKTUR
        // hıc birinin çalışmama ihtimali --- YOKTUR


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not > 50) {
            System.out.println("sınıfı geçtin");
        } else {
            System.out.println("malesef kaldın");
        }

    }
}
