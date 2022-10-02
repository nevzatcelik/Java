package day_46_Maps;

import day_44_Maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Maps {
    public static void main(String[] args) {
        //Verilen bir ogrenci map’inde her sinifta kacar ogrenci oldugunu yazdiran bir method olusturun.

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        //beklenen sonuc {10=2,11=2}

        Map<String,Integer> sinifsayilariMap=new HashMap<>();

        Set<Map.Entry<Integer,String>> ogrenciMapEntrySeti=ogrenciMap.entrySet();
        System.out.println(ogrenciMapEntrySeti);

        for (Map.Entry<Integer,String> entry: ogrenciMapEntrySeti
        ) {
            //Elimizde 101=Ali-Can-10-H-MF

            String[] tempValueArr=entry.getValue().split("-"); // [101=Ali,Can,10,H,MF]

            String sinifBilgisi=tempValueArr[2];
            // suan elimizde sinif bilgisi var
            // bunu yeni olsuturdugumuz sinifSayilariMap e ekleyecegiz

            if (sinifsayilariMap.containsKey(sinifBilgisi)) {
                //  eger iceriyorsa onceden bu siniftan ogrenci girilmis demektir,ogrenci sayisini 1 arttirmalidir
                sinifsayilariMap.put(sinifBilgisi, sinifsayilariMap.get(sinifBilgisi) + 1);

            } else{
                sinifsayilariMap.put(sinifBilgisi, 1);
                // daha once bu siniftan hic ogrenci girilmemis demektir
                // bu sinifta bir ogrenci oldu demem gereekir
            }
        }
        System.out.println(sinifsayilariMap);
    }

}
