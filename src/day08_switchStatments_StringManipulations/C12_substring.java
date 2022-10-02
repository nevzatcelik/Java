package day08_switchStatments_StringManipulations;

public class C12_substring {
    public static void main(String[] args) {

        // substring () : verilen bir String in isttenen bir parcasini bize dondurur-

        String str= "Java Guzeldir";
        str.substring(2) ; // va Guzeldir

       // son 3 karakter
        System.out.println(str.substring(str.length()-3));
        // dinamik oldugu icin bu sekilde yazilmasi daha iyidir

        System.out.println(str.substring(str.length()-1)); // r

        System.out.println(str.substring(str.length())); // java hiclik dondurur

       // System.out.println(str.substring(str.length()-14)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(0));

        System.out.println(str.substring(3)); // a Guzeldir



    }
}
