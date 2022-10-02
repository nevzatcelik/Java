package day10_stringManipulation;

public class C05_replaceAll {
    public static void main(String[] args) {

        /*
        replace(eskiString'yeniString) yazdigimizda zaten eskiString ile ayni olan
        tum metinleri yeniString ile degistiriyordu
         */

        String str= "Ja1va Gu2zel2dir13.";
        // eger metindeki rakamlardan kurtulmak istersek 3 kere replace yazmak gerekir ORN;

        str=str.replace("1","");
        str=str.replace("2","");
        str=str.replace("3", "");
        System.out.println(str); // Java Guzeldir

        str="J1a2va3 G4u5z6e7l8d9i0r.";

        /*
        replaceAll methodu tek tek Stringleri degil de tum sayilari, tum boslukari , tum harfleri.....
        gubu ortak ozellikle tanimlanabilecek karakterlerin hepsini toptan degistirmek icin
        kullanilir.
         */

        //ornegin yukardaki metinde tum rakamlardan tek seferden kurtulalim

        str=str.replaceAll("\\d","");
        System.out.println(str); // Java Guzeldir. yazidirir

        str="Java     Guzel bir proglamlama       dili";
        // EGER BIRDEN FAZLA BOSLUK OLAN YERLERI HALLETMEK ISTERSEK


        str=str.replaceAll("\\s+"," ");
        System.out.println(str); // Java Guzel bir programlama dili



    }
}
