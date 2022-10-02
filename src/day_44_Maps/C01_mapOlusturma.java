package day_44_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_mapOlusturma {
    public static void main(String[] args) {
        /*
        Bir Lisede ki ogrenci bilgilerini tutacak bir map olusturalim
        Ogrenci numarasi key olsun,
        Isim,soyisim,Sinif,Sube,Alan bilgilei value icersinde yer alsin

        key: 101
        value:Ali,Can,10,H,MF

            Bir map olusturulurken oncelikle key ve value nun data turlerine karar verilir.

            Value 1 den fazla bilgi birlestirilerek olusturulmussa
            1-Burada ki bilgilerin sirasi
            2-bilgiler arasinda kullanilacak ayrac standart olmalidir
         */
        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");

        System.out.println(ogrenciMap);


        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz}
        // standart giris acisindan map'de herseyi method ile yapmata fayda vardir
        //
    }
}
