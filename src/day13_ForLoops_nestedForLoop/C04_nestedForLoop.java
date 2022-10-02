package day13_ForLoops_nestedForLoop;

public class C04_nestedForLoop {
    public static void main(String[] args) {

        /*
        ic ice (nested) iki loop varsa outer loop her deger aldiginda inner loop bastan sona
        bir kez calisir
         */

        for (int i = 1; i <=5 ; i++) { // dis loop , outer loop

        for (int j = 1; j <=5 ; j++) { // ic loop , outer
            System.out.print(i*j + "  ");

            }
            System.out.println("");
        }


    }
}
