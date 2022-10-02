package day02_scanner_dataCasting;

public class C08_DataCasting {
    public static void main(String[] args) {

        double doubleSayı=23.4;

        int intSayı= (int)doubleSayı;
        System.out.println(intSayı);

        //verilen 3 tam sayının  ortalamasını yazdıralım??

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;

        System.out.println((sayi1+sayi2+sayi3)/3);
        // Eger islem yapılan tum sayılar ınt ise java sonucu da int olarak verir ama sayılardan biri int
        // dıgerı doublesa sonucu geniş olana otomatik olarak cast eder.

        double sayi4= 15;
        System.out.println((sayi1+sayi4)/2);

        // verilen 3 tam sayının ortalamasını double yazdırın

        System.out.println(((double)sayi1+sayi2+sayi3)/3);

    }
}
