package day09_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java cok guzel,cok.";
        System.out.println(str.indexOf('a')); // buldugu ilk a nin index ini verir

        System.out.println(str.indexOf('a',1));// 1.index ve sonrasinda a arar

        System.out.println(str.indexOf('a',2)); // 3

        System.out.println(str.indexOf("cok")) ; // 5 cok un ilk harfi olan c nin index sayisi olur.

        System.out.println(str.indexOf("cok",6));// 5 dersek kendi olur 6 dan sonra aramamiz lazim

        // ya olmayan char veya Strin aratirsak ?
        // java indexOf() methodu ile olmayan bir char veya string aranirsa -1 doner

        System.out.println(str.indexOf("Soner"));
        System.out.println(str.indexOf('t'));


        // YUKARIDAKI str cumlesinin F harfi icerip icermedigini indexOf kullanara yazdirin

        System.out.println(str.contains("f"));

        int index=str.indexOf('f'); // yoksa -1 doner varsa f'nin indexini doner

        if (index<0) {
            System.out.println("cumle f icermiyor");
        } else {
            System.out.println("cumle f iceriyor");
        }




    }
}
