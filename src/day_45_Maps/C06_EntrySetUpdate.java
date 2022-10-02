package day_45_Maps;

import day_44_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {
    public static void main(String[] args) {

        // Mf olan bolum isimlerini sayisal olarak degistielim

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
       Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

       Integer tempKey;
       String tempValue;
       String[] tempvalueArr;

        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
             ) {
            // her bir entry suanda bu durumda; Ali-Can-10-H-MF

            tempValue=each.getValue();
            tempvalueArr=tempValue.split("-");

            if (tempvalueArr[4].equalsIgnoreCase("mf")){
                tempvalueArr[4]="Say";
            }
            // array i yeniden // Ali-Can-10-H-Say haline getirmemiz lazim

            tempValue=tempvalueArr[0]+" "+
                      tempvalueArr[1]+" "+
                      tempvalueArr[2]+" "+
                      tempvalueArr[3]+" "+
                      tempvalueArr[4];

            each.setValue(tempValue);

        }
        System.out.println(ogrenciMap);

    }
}
