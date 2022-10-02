package day38_expections;

public class C05_SomeException {
    public static void main(String[] args) {

        // 1- NullPointerExceptions
        String str=null;

        System.out.println(str);

      //  System.out.println(str.concat("Ali"));// NullPointExpections

        // 2- StringIndexOfBoundsException

        String str2="Java";
        // System.out.println(str2.charAt(6)); // StringIndexOfBoundsExpection

        // 3 ArrayIxdexOfBoundsExpection

        int [] arr={3,5,7,9};
        System.out.println(arr[8]);

    }
}
