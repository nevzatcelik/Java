package sweden_StringManipulation_Anlatim;

public class C01_Concatenation {
    public static void main(String[] args) {

         // concatenation= birlestirme,birbirine baglama


    String a="Turkiye";
    String b="Baskenti";
    String c="Ankara'dir";
    String d="";
    String e= " ";


    int f= 5;
    int g= 4;
    // Yukaridaki variable lari kullanarak "Turkiye'nin Baskenti Ankara'dir" yazidirin
        // "Turkiye'nin Baskenti Ankara'dir 54 bunlari yap
        // "Turkiye'nin Baskenti Ankara'dir 9 bunlari yap


       // System.out.println(a+b+c); // Turkiye'ninBaskentiAnkara'dir
        // System.out.println(a+e+b+e+c); // Turkiye'nin Baskenti Ankara'dir
       // System.out.println(a+e+b+e+c+e+f+g);
        //Turkiye'nin Baskenti Ankara'dir 54

     //   System.out.println(a+e+b+e+c+e+(f+g)); // !!!!!!!!!

        System.out.println(a+"´nin"+f+g+f+g+f+g); // Turkiye'nin545454

        System.out.println(f+g+f+g+a+g+f); // 18Turkiye'nin45
        System.out.println(f+g+d+f+g+a); // 954Turkiye'nin
        System.out.println(f+d+g+e); //54



        /*
        String methodlari icerisinde arti (+) islemi yerine kullanilabilecek concat() methodu vardir
         */

        System.out.println(a.concat(e).concat(b).concat(e).concat(c)); // Turkiye'nin Baskenti Ankara'dir

    String deneme=""+105; // bir int ifadeyi hiclik isareti koyarak toplama yapmadan birlesim sagalayabiliriz
        System.out.println(deneme+4); // 1054

    }
}
