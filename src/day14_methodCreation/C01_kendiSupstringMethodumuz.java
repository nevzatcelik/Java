package day14_methodCreation;

public class C01_kendiSupstringMethodumuz {
    public static void main(String[] args) {

        String str="Java Candir";
        /*
        Kullancidan imput olarak verilen baslangic ve bitis imdexlerine gore
        baslangic index i dahil bitis index i haric olacak sekilde
        aradaki harfleri yazdirin

        kullanici baslangic degeri olarak
        bitis degerinden buyuk bir sayi girerse hata mesaji verin

        kullanici str da olan index lerden daha buyuk bir index girerse hata mesaji yazdirin
         */

        int basIndex=2;
        int bitIndexi=6;

        kendiSubstringMethodumuz(str,basIndex,bitIndexi);
        kendiSubstringMethodumuz(str,basIndex,bitIndexi);
        kendiSubstringMethodumuz(str,3,5);

        kendiSubstringMethodumuz(str,-2,3); // hata mesaji

        // kendi substring methodumuzu bize string dondurecek sekle getirelim
        

        System.out.println(str.substring(2,6));
        String yeniStr=str.substring(1,4); // ava

        System.out.println(stringDondurenKendiSubstringMethodumuz(str,0,1));
        String ilkHarf=stringDondurenKendiSubstringMethodumuz(str,0,1);
    }









    public static void kendiSubstringMethodumuz(String str, int basIndex, int bitIndexi) {

        if (basIndex>bitIndexi) {
            System.out.println("Baslangic index i bitis index inden buyuk olamaz");
        } else if (basIndex<0 || basIndex>str.length() || bitIndexi<0 || bitIndexi>str.length()-1){
            System.out.println("gecersiz index kullanimi");
        }else {
            for (int i = basIndex; i <bitIndexi ; i++) {
                System.out.print(str.charAt(i)+"");

            }

        }
        System.out.println("");
    }
    public static String stringDondurenKendiSubstringMethodumuz(String str, int basIndex, int bitIndexi){
        String istenenSubstring="";
        if (basIndex>bitIndexi) {
            System.out.println("Baslangic index i bitis index inden buyuk olamaz");
        } else if (basIndex<0 || basIndex>str.length() || bitIndexi<0 || bitIndexi>str.length()-1){
            System.out.println("gecersiz index kullanimi");
        }else {

            for (int i = basIndex; i <bitIndexi ; i++) {
                istenenSubstring+=str.charAt(i);


            }

        }
       return istenenSubstring;
    }
}
