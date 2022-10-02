package day11_strinManupulation_forLoop;

import java.util.Scanner;

public class C08_Soru6 {
    public static void main(String[] args) {
        /*
        kullanicidan isim ve soy ismini ayri ayri alin.
        ismi daha uzun ise isim ve soyoismi ilk harf buyuk,kalanlar kucuk seklinde yazdirin
        soy isim daha uzun ise ismi ilk harf buyuk digerleri kucuk,soyismi buyuk harflerle yazdirin
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir isim giriniz");
        String isim= scan.next();

        System.out.println("Lutfen bir soyisim giriniz");
        String soyisim= scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase() +
                            isim.substring(1).toLowerCase() +
                            " "+
                            soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase()
            );

        }else {System.out.println(
                isim.substring(0,1).toUpperCase() +
                        isim.substring(1) +
                        " "+
                        soyisim.toUpperCase()
        );

        }




    }
}
