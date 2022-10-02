package sweden_StringManipulation_Anlatim;

public class C05_Replace {
    public static void main(String[] args) {

        String str= "Istanbul Stockholm'den daha buyuktur";
        // target= hedef,amac
        // replacement= yenisiyle degistirme

       str=str.replace("a","u");
        System.out.println(str);
        str=str.replace(" ","9");
        System.out.println(str);
        str=str.replace("Stockholm","Istanbul");
        System.out.println(str);

       str=str.replace('u','o');
        System.out.println(str);

    }
}
