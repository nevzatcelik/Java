package day10_stringManipulation;

public class C02_isEmpty_null {
    public static void main(String[] args) {

        String str="Java ogren, 70000 euro'yu kap";

        System.out.println(str.isEmpty());

        String str2="";

        System.out.println(str2.isEmpty());

        String str3= "   ";
        System.out.println(str.isEmpty());
        System.out.println(str3.isBlank());

        System.out.println(str2.length()); // 0

        System.out.println(str3.length()); // 3

        /*
          Java da null pointer diye bir isaretci var
          Null pointer bir deger degildir ama bir stringin degerinin atanmadigini isaret eder

          Java da bir String variable a basta deger atamamak istersek iki ihtimal var
          1- ya nulll ile isaretleriz (String str4=null)
          java yazdirdiginizda bunun null oldfugunu yazfirir ama baska bir method calistirmak istersneiz
          RTE verir

          2- veya sadece deklare eder deger atamyiz
          String str5;
          ne yazdirabiliriz ne de herhangi bir kodda kullanabiliriz
          bu veriable i yazarsaniz java CTE verir

         */

        String isim1=null; // bu bir deger degildir bu satirda bir deger atamasi yoktur
                           // sadece isim bir null olarak isaretlemmistir
        String isim2;

        System.out.println(isim1); // null
        // System.out.println(isim1.length()); //NullPointerException error
        // sen isim 1 e deger atamadin onu bos olarak isaretledin
        // dolayisiyla atamadigin bir ismi herhangi bir method la kullanamazsin

       // System.out.println(isim1.isEmpty()); calisir ama RTE verir

       // System.out.println(isim2.isEmpty()); hic calismaz CTE verir


    }
}
