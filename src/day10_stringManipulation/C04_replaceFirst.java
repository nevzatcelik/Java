package day10_stringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str= "Herkesin githup'i olamli";

        System.out.println(str.replaceFirst("e", "a")); // Harkesin githup'i olmali

        System.out.println(str.replace("e","a")); // Harkesin githup'i olamali


    }
}
