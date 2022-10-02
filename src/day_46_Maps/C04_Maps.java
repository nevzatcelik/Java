package day_46_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {

        Map<String,Integer> ornekMap=new HashMap<>();
        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);

        System.out.println(ornekMap);

        ornekMap.put("b",7); // var mi, yok mu kontrol etmeden ekler
        ornekMap.putIfAbsent("a",7); // yoksa ekle dedigimizden a var oldugu icin eklemez
        ornekMap.putIfAbsent("e",3); // yoksa ekle dedigimizden e yok oldugu icin ekler

        System.out.println(ornekMap);

        ornekMap.put("g",3); // yok olani ekle
        ornekMap.put("a",2); // var olani degistir

        ornekMap.putIfAbsent("c",5); // buna islem yapmaz
        ornekMap.putIfAbsent("h",4); // yoksa ekle dediginden ekleyecek

        System.out.println(ornekMap);

        ornekMap.compute("a",(k,v)->2*v); // a nin degerini 2 ile carpacak
        System.out.println(ornekMap); // {a=4, b=7, c=2, d=5, e=3, g=3, h=4}

        ornekMap.computeIfPresent("c",(k,v)->20);
        ornekMap.computeIfPresent("k",(k,v)->30);
        System.out.println(ornekMap);

        ornekMap.computeIfAbsent("c", v->15); // islem yapmaz
        ornekMap.computeIfAbsent("m", v->12); // ekler
        System.out.println(ornekMap); // {a=4, b=7, c=20, d=5, e=3, g=3, h=4, m=12}


    }
}
