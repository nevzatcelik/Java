package day27_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Uygulama : Main method’da bir list olusturup elemanlar atayalim.

        2 method olusturup once listeyi, sonra listedeki elemanlari degistirelim.

        ilk method’da bizim listemiz disinda bir liste olusturup deger atayalim, sonra yeni listeyi bizim asil
        listemize atayalim ve asil listemizi main method’a dondurelim.

        ikinci method’da bizim listemizin elementlerini degistirip, asil listemizi main method’a dondurelim.
         */

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);

        System.out.println(listeyiDegistir(sayilar));

        System.out.println("1.metheod call dan sonra asil liste :"+sayilar); //[1,2]

        System.out.println(elementleriDegistir(sayilar));
        System.out.println("2.metheod call dan sonra asil liste :"+sayilar);// [101,102]
    }

    private static List<Integer> elementleriDegistir(List<Integer> sayilar) {
        sayilar.set(0,101);
        sayilar.set(1,102);

        return sayilar ;


    }

    private static List<Integer> listeyiDegistir(List<Integer> sayilar) {
        List<Integer> yeniList=new ArrayList<>();
        yeniList.add(11);
        yeniList.add(12);
        yeniList.add(13);

        sayilar=yeniList;
        return sayilar;
    }
}
