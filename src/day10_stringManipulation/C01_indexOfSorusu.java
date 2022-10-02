package day10_stringManipulation;

import java.util.Scanner;

public class C01_indexOfSorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir kelime isteyin cumlede kelimenin kullanimina gore
        asagidaki cumlelerden uygun olani yazdir

        -cumle aradiginiz kelimeyi icermiyor
        -aradiginiz kelime cumlede sadece 1 tane var
        -aradiginiz kelime cumlede birden fazla var
         */

        String cumle="Java cok guzel, cok" ;
        String kelime="v";

        int ilkKullanimIndexi= cumle.indexOf(kelime); //2
        int ikinciKullanimIndexi= cumle.indexOf(kelime,ilkKullanimIndexi+1); // 3

        if (!cumle.contains(kelime)) {
            System.out.println("Cumle aradiginiz kelimeyi icermiyor");
        } else if (ikinciKullanimIndexi==-1){
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");
        } else {
            System.out.println("aradiginiz kelime cumlede birden fazla var");
        }

    }
}
