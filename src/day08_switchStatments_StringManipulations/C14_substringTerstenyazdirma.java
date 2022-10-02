package day08_switchStatments_StringManipulations;

public class C14_substringTerstenyazdirma {

    public static void main(String[] args) {

        // verilen 4 basamakli bir stringin terse ceviren bir program yaziniz

            String str= "JAVA";

            String tersStr= str.substring(3) +
                    str.substring(2,3) +
                    str.substring(1,2) +
                    str.substring(0,1) ;

        System.out.println(tersStr);
    }
}
