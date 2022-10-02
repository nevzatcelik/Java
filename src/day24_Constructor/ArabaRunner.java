package day24_Constructor;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1= new Araba();
        //default contructor calisir ve standart ozelliklerde bir arb ureti.
        System.out.println(arb1); // arb1 objedir direk yazdiralamaz
                                // yazdirabilmek icin Araba classinda toString() olustururuz
        // yazdirir; Araba ozelliklerIlanNo=0, Marka='Deger atanmadi', model=' deger atanmadi', yil=0, fiyat=0'

        arb1.IlanNo=1201;
        arb1.Marka="OPEL";
        arb1.model="Corsa";
        arb1.yil=2013;
        arb1.fiyat=10000;

        System.out.println(arb1.toString());
        // Araba ozelliklerIlanNo=1201, Marka='OPEL', model='Corsa', yil=2013, fiyat=10000

        Araba arb2=new Araba(1243,"Toyota","Corolla",2008,8000);
        System.out.println(arb2);
        //Araba ozelliklerIlanNo=1243, Marka='Toyota', model='Corolla', yil=2008, fiyat=8000

        Araba arb3=new Araba(1456,"Mercedes","s320",2000,10000);
        System.out.println(arb3);
        //Araba ozelliklerIlanNo=1456, Marka='Mercedes', model='s320', yil=2000, fiyat=10000

        /*
        -parametrelerin farkli isimde olmasi buyuk projelerde sorun olur
        -cok kisinin calistigi projelerde parametre ismi ile instance isminin ayni olmasini tercih
        ederiz
        -
         */



    }
}
