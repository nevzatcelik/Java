package day08_switchStatments_StringManipulations;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class C13_substring {
    public static void main(String[] args) {

        String str= "Java Guzeldir.";

        System.out.println(str.substring(1,3)); // bunu anlami 1. index den basla (3-1) karakter yaz!!!!

        System.out.println(str.substring(5,10)); // Guzel yazdirmak icin 5. karaterden 10. karatere alinir

        System.out.println(str.substring(0,12)); // Java Guzeldi

        // son 3 karakter haric tum metni yazdiralim

        System.out.println(str.substring(0,str.length()-3));

        System.out.println(str.substring(4,5));
        System.out.println(str.substring(2,3));

       // System.out.println(str.substring(5,2)); hata verir!!!! geriye gidemez

    }
}
