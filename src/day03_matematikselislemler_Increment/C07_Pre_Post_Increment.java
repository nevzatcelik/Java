package day03_matematikselislemler_Increment;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        a++;
        System.out.println(a);//11

        ++a;

        System.out.println(a);// 12

        // Yeni bir variable olusturun, a nin degerini yeni bir veriable a atayin
        // sonra a nin degerini bir arttirin

        int b= a ;
        a++; // int b=a++;

        System.out.println("a nin degeri :" +a+ ", b nin degeri:"+ b);// a=13, b=12

        // Yeni bir variable olusturun, a nin degerini yeni bir veriable a atayin
        // sonra a nin degerini bir arttirin

        int c=a++;

        System.out.println("a nin degeri :" + a + ", c nin degeri:" + c);






    }
}
