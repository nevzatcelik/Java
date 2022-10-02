package day_45_Maps;

import day_44_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
    public static void main(String[] args) {
        // 10.siniftaki ogrencilerin no,isim,soyisim,bolumlerini bir Liste olarak kullaniciya yazdirin.....
        // No  Isim  Soyisim  Bolum, seklinde

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMap.entrySet();
        Integer tempKey;
        String tempValue;
        String tempValueArr;

        for (Map.Entry<Integer,String> each:ogrenciEntrySeti
             ) {
            tempKey=each.getKey();
            tempValue= each.getValue();
            //tempValueArr=tempValue.split("-");

            //if (tempValueArr[2].eq)




        }

    }
}
