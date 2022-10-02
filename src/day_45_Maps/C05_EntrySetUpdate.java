package day_45_Maps;

import day_44_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {
        // Tum ogrencilerin siniflarini bir arttirin

        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntryMap=ogrenciMap.entrySet();
        String eskiValue;
        String yeniValue;
        String[]tempValueArr;

        for (Map.Entry<Integer,String > each: ogrenciEntryMap

             ) {
            eskiValue= each.getValue(); // Ali-Can-10-H-,MF
            tempValueArr=eskiValue.split("-");

            tempValueArr[2]=Integer.parseInt(tempValueArr[2])+1+"";
            yeniValue= tempValueArr[0]+"-"+
                       tempValueArr[1]+"-"+
                       tempValueArr[2]+"-"+
                       tempValueArr[3]+"-"+
                       tempValueArr[4];
                    each.setValue(yeniValue);

        }
        System.out.println(ogrenciMap);
    }
}
