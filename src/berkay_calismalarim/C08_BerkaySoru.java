package berkay_calismalarim;

public class C08_BerkaySoru {
    public static void main(String[] args) {

        /*
        " Java Java Python Python C# C# C++ C++ Python Python Python Python".
        lutfen Pyhton yerine bosluk ekleyin
         */

        String str=" Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String yeni=str.replaceAll("Python"," ");
        System.out.println(yeni);

        String str1="kopek kopek kopek kopek kopek";
        String str2=str1.replaceAll("kopek","kedi");
        System.out.println(str2);

    }
}
