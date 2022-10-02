package day_45_Maps;

import day_44_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // Tum ogrencilerin bilgilerini bir liste seklinde kullanicilara yazdirin
        // No isim Soyisim Sinif Sube Bolum
        // 101
        /*
        Java map lerde key ve value yu birlikte manipule edebilmemiz icin map llere ozel Entry Class i olustumustur.
        101=Ali-Can-10-H-MF   1.Entry
        102=Veli-Cem-11-M-Soz   2.Entry

         */

        Map<Integer,String> ogrenciMAP= ReusableMethods.ogrenciMapOlustur();
        System.out.println("No Isim Soyisim Sinif Sube Bolum");
        //Map deki tum entry'leri bir set e store ettik
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMAP.entrySet();

        for (Map.Entry<Integer,String>each:ogrenciEntrySeti
             ) {
            Integer tempKEY=each.getKey();
            String tempVALUE=each.getValue(); //Ali-Can-10-H-MF
            String[] tempValueArr=tempVALUE.split("-"); // [Ali, Can, 10, H, MF  ]
            System.out.println(tempKEY+ " " + tempValueArr[0]+" "+
                                              tempValueArr[1]+" "+
                                              tempValueArr[2]+" "+
                                              tempValueArr[3]+" "+
                                              tempValueArr[4]);

        }
    }
}
