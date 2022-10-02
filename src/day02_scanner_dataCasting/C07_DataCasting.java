package day02_scanner_dataCasting;

public class C07_DataCasting {
    public static void main(String[] args) {

        String isim= "Esra";

        isim="Ayse";

        // isim= `s´; String bir variable a boolean int veya char degeri atayamazsiniz.

        boolean iyiMi=true;

        //boolean data turundeki bir verable a da string char int atayamazsiniz

        int sayiInt=12;
        short sayiShort=20;
        byte sayiByte=21;
        double sayiDouble=14;


        // ayni veya benzer datalar iceren variable lerde ise kontrollu gecis mumkundur

        sayiDouble=sayiInt;
        sayiInt=sayiShort;

        sayiByte= (byte) sayiInt;
        sayiShort= (short) sayiDouble;


        // sayiByte=sayiInt
        // sahiShort=sayiDouble
        // java bu iki degistirmeyi kabul etme cunku buyuklerini calistirma yapmadan bilemez.
        // byte<short<int<long<float<double yani kucuktekileri buyuge aktarabiliriz fakat buyukleri kucuk
        // olanlara aktaramayiz










    }
}
