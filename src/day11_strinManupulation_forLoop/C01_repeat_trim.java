package day11_strinManupulation_forLoop;

public class C01_repeat_trim {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.repeat(4));

        str="   Ali kos   " ;
        str=str.trim();

        System.out.println(str); // Ali kos

    }
}
