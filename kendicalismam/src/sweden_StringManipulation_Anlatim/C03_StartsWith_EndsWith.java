package sweden_StringManipulation_Anlatim;

import java.util.Scanner;

public class C03_StartsWith_EndsWith {
    public static void main(String[] args) {

        String str="Turkiye'nin nufusu 85 milyon'dur.";


        System.out.println(str.startsWith("Turkiye")); //true
        System.out.println(str.startsWith("T")); //t
        System.out.println(str.startsWith("Tur")); //t
        System.out.println(str.startsWith("turkiye'nin")); //f
        System.out.println(str.startsWith("n",12)); //true
        System.out.println(str.startsWith("85",19)); //true

        System.out.println(str.endsWith("milyon'dur.")); //true
        System.out.println(str.endsWith("dur.")); // true
        System.out.println(str.endsWith("milyon'dur")); //false

        // Kullanicidan bir internet sayfasi isteyiniz input www.youtube.com.tr
        // site www. ile baslamiyorsa site www. ile baslamali 1.sart
        // site .com ile bitmiyorsa site.com ile bitmeli 2.sart
        // site .tr icermiyorsa tr sayfaya ulasmak icin tr eklemelisiniz 3.sart

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir internet sayfasi giriniz");
        String internetSayfasi=scan.nextLine();

        if (!internetSayfasi.startsWith("www.")) {
            System.out.println("site www. ile baslamali");
        }else if (!internetSayfasi.contains(".com")) {
            System.out.println("siteye .com yazmadan ulasamazsiniz");

        } else if (!internetSayfasi.endsWith(".tr")) {
            System.out.println("'.tr' ile bitmiyorsa tr sunucusu siteye ulasamazsiniz ");
        } else {
            System.out.println(internetSayfasi);
        }

        }

    }


