package sweden_StringManipulation_Anlatim;

import java.util.Scanner;

public class C02_Contains {
    public static void main(String[] args) {
        String str="Java 7 cok guzel, cok.";

        System.out.println(str.contains("Java")); // True

        System.out.println(str.contains("java")); // False

        System.out.println(str.contains("cok"));
        System.out.println(str.contains("7"));


        /*
        contains methodu bir string in istedigimiz bir char veya String i icerip icermedigini kontrol
        eder ,contains() aranan string in kac tane olduguna bakmaz sadece icerip icermedini kontrol eder

        Char Squence == CharZinciri diye dusunebiliriz ve String diyebiliriz!!!
        her string char'lardan olusan bir zincirdir diyebiliriz.

        contains methodu char kabul etmez, CharSquence ister.!!!

         */
        System.out.println(str.contains("a")); // TRUE
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true

        // ornek;

        String kelime="Ali ahmet'e odunc kalem verdi";
        System.out.println(kelime.contains("a")); //true
        System.out.println(kelime.contains("z")); // false
        System.out.println(!kelime.contains("j")); //true

    }
}
