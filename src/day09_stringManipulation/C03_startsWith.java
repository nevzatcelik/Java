package day09_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="Java cok guzel,cok.";

        System.out.println(str.startsWith("J")); // True
        System.out.println(str.startsWith("Java")); // True
        System.out.println(str.startsWith("Java cok guzel,cok.")); //True
        System.out.println(str.startsWith("")); // hiclik true!!
        System.out.println(str.startsWith("cok"));
        System.out.println(str.startsWith("cok",5)); // 5. index ve sonrasi cok ile mi basliyor
                                                                   // True
        System.out.println(str.startsWith("guzel",10)); // False







        System.out.println(str.endsWith(".")); // True

        System.out.println(str.endsWith("cok.")); // True


    }
}
