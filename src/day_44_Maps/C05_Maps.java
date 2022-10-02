package day_44_Maps;

import java.util.List;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        // bransi verilen ogrencilerin isim ve soyisimlerini liste olarak yazdirin
        // MF dedigimizde Ali Can,Ayca Can

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        List<String> bransOgrenciListesi=ReusableMethods.bransdakiOgrencilerListesi(ogrenciMap,"TM");
        System.out.println(bransOgrenciListesi);
    }
}
