package day09_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java cok guzel, cok.";

        System.out.println(str.contains("Java")); // true

        System.out.println(str.contains("java")); // false "kucuk j"

        System.out.println(str.contains("cok")); // true

        /*
        contains methodu bir string in istedigimiz bir char veya String i icerip icermedigini kontrol
        eder contains() aranan string in kac tane olduguna bakmaz sadece icerip icermedini kontrol eder

        Char Squence == CharZinciri diye dusunebiliriz ve String diyebiliriz!!!
        her string char'lardan olusan bir zincirdir diyebiliriz.

        contains methodu char kabul etmez, CharSquence ister.!!!

         */

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true


    }
}
