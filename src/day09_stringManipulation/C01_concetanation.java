package day09_stringManipulation;

public class C01_concetanation {
    public static void main(String[] args) {

        String a="Java";
        String b="Guzeldir";
        String c="";
        String d= " ";

        int s= 5;
        int t= 4;
         // Yukaridaki variable lari kullanarak Java Guzeldir 9 yazidirin

        System.out.println(a+d+b+d+(s+t)); //Java Guzeldir 9

        /*
        String methodlari icerisinde arti (+) islemi yerine kullanilabilecek concat() methodu vardir
         */

        System.out.println(a.concat(d).concat(b).concat(d).concat(s+t+c));

        String deneme= 10+"";
        System.out.println(deneme+4); // 104



    }
}
