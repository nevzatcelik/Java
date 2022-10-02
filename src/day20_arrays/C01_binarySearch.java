package day20_arrays;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;

public class C01_binarySearch {
    public static void main(String[] args) {

        /*
        verilen bir arrayde istenen elementin olup olmadigini kontrol etme
         */

        String[] arr ={"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Naci"};
        String arananElemenet="Bora";

        // bunu degistir sonra
       // C04_ElementArama.elemanVarMi(arr.arananElement);

        // Java da arama methodu var

        Arrays.binarySearch(arr,arananElemenet);System.out.println();

    }
}
