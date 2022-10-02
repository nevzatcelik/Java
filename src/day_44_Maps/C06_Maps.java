package day_44_Maps;

import java.util.List;
import java.util.Map;

public class C06_Maps {
    public static void main(String[] args) {
        // verilen siniftaki ogrencilerin isim ve soyisimlerini liste olarak donduren bir method olusturun

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        List<String> sinifOgrenciListesi= ReusableMethods.siniftakiogrenciListesiOlustur(ogrenciMap,10);
        System.out.println(sinifOgrenciListesi); // [Ali Can, Ayse Cem]

    }
}
