package sweden_StringManipulation_Anlatim;

public class C04_IndexOf {
    public static void main(String[] args) {

        String str="Sweden's capital city is Stockholm";

        System.out.println(str.indexOf("s")); //s
       System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("a",10)); //10
        System.out.println(str.indexOf("S",2)); //25
        System.out.println(str.indexOf("s", 8)); //23
        System.out.println(str.indexOf("a", 11)); //14
        System.out.println(str.indexOf("S",0)); // 0
        System.out.println(str.indexOf(" ")); // bosluk

        // str cumlesinin z harfi icerip icermedigini indexOf kullanarak yazdirin
        System.out.println(str.indexOf("z")); // -1


        System.out.println(str.lastIndexOf("h")); //30
        System.out.println(str.lastIndexOf(" ")); // 24



        //


        String cumle="Stockholm sivastan daha buyuktur" ;
        String kelime="o";

        int ilkIndexi= cumle.indexOf(kelime);
        int ikinciIndexi= cumle.indexOf(kelime,ilkIndexi+1);

        if (!cumle.contains(kelime)) {
            System.out.println("Cumle aradiginiz kelimeyi icermiyor");
        } else if (ikinciIndexi==-1){
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");
        } else {
            System.out.println("aradiginiz kelime cumlede birden fazla var");
        }

    }
}
