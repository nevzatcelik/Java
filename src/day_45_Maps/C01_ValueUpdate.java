package day_45_Maps;

import day_44_Maps.ReusableMethods;

import java.util.Arrays;
import java.util.Map;

public class C01_ValueUpdate {
    public static void main(String[] args) {
        // 103 numarali ogrencinin soyisimini Yan yapin

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        String ogrenciEskiBilgiler=ogrenciMap.get(103);
        System.out.println(ogrenciEskiBilgiler);

        String[]ogrencValueArr=ogrenciEskiBilgiler.split("-");
        System.out.println(Arrays.toString(ogrencValueArr)); //[Ali,cem,11,b,TM]

        ogrencValueArr[1]="Yan";
        System.out.println(Arrays.toString(ogrencValueArr));

        String ogrenciYeniValue=ogrencValueArr[0]+"-"+
                                ogrencValueArr[1]+"-"+
                                ogrencValueArr[2]+"-"+
                                ogrencValueArr[3]+"-"+
                                ogrencValueArr[4];

        ogrenciMap.put(103,ogrenciYeniValue);
        System.out.println(ogrenciMap);


    }
}
