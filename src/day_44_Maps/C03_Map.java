package day_44_Maps;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Map {
    public static void main(String[] args) {
        // map deki key listesini ve value listersini ayri ayri yazdiirin

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        // clasimizda kullanabilmek icin bu keySet i kaydetmek istersek

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();

        System.out.println(ogrenciMap.values());
        Collection<String> ogrenciValueColl=ogrenciMap.values();

        // 103 numarali ogrencicin bilgilerini yazdiralim

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-B-TM

       // 103 numarali ogrencinin bransini yazdirin

        String ogrenciValue=ogrenciMap.get(103);
        String[] ogrenciValueArr=ogrenciValue.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr));
        System.out.println("103 numarali ogrencinin bransi : "+ogrenciValueArr[4]); // TM

        System.out.println("103 numarali ogrencinin sinif : "+ogrenciValueArr[2]); //11
    }
}
