package day02_scanner_dataCasting;

public class C09_DataCasting {
    public static void main(String[] args) {

        int intSayi=567;

        byte byteSayi=(byte)intSayi;

        System.out.println("intSayi :" + intSayi +"yi byte a cevirirsek degeri:"+ byteSayi); // 55,
        /*
        1- eger kucuk data turundeki datayi, buyuk data turumdeki veriable a atama yaparsak otomatik genisler
        2- eger buyuk data turundeki datayi, kucuk data turundeki veriable a atama yaparsak, java islemi
        otomatik yapmaz,bizden sorumluluk almamizi ister
       data kaybi(odanlik sayinin gitmesi) veya donusum olabilir.
         */

        char harf= 'a';
        int say= 100;

        System.out.println(harf+say);


    }
}
