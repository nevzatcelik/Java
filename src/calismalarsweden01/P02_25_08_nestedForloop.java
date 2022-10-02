package calismalarsweden01;

public class P02_25_08_nestedForloop {
    public static void main(String[] args) {
       // 1- nested for loop dan  carpim tablosunu 10 satir ve sutun seklinde ekrana yazdiralim.

        for (int i = 1; i <=10 ; i++) {

            for (int j =1; j <=10 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }
}
