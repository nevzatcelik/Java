package sweden_StringManipulation_Anlatim;

public class C06_FirstREPLACE {
    public static void main(String[] args) {

        String str="Isvec sosyalist bir devlettir ";

        str=str.replaceFirst("a","o"); // ?
        System.out.println(str);
       str=str.replaceFirst("d","s");
        System.out.println(str);
        str=str.replaceFirst(" ","0");
        System.out.println(str);

    }
}
