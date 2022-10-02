package day_46_Maps;

import day_44_Maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        Map<String,Integer> ornekMap=new HashMap<>();
        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);

        System.out.println(ornekMap);

        System.out.println(ornekMap.containsValue(5)); // true

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        System.out.println(ogrenciMap.containsValue("Ali"));
        // ContainsValue ("IstenenDeger") methodu tam olarak value girilirse doner
        // ancak value icerisindeki bir degeri(mesela Ali...) aratirsaniz false doner

        System.out.println(ornekMap.replace("d", 10)); // eski degerini dondurur
        System.out.println(ornekMap);

        ornekMap.replace("a",5,8);
        System.out.println(ornekMap.replace("b",1,2));
        System.out.println(ornekMap);

        System.out.println(ornekMap.getOrDefault("a", 6)); // 3
        System.out.println(ornekMap.getOrDefault("m", 8)); // 8
        System.out.println(ornekMap); // {a=3, b=2, c=2, d=10}


    }
}
