package day03_matematikselislemler_Increment;

public class C04_Increment {
    public static void main(String[] args) {

        int a=12;
        int b=8;


        a+= b; // a=a+b
        System.out.println("a : "+ a +",b :" +b);

        a--; // a=a-1=19
        b++; // b=b+1=9
        System.out.println("a : "+ a + ",b :" +b);

        a/=b; // a=a/b
        System.out.println("a : "+ a + ",b :" +b);

        b*=3;//b=b*3=27
        System.out.println("a : "+ a + ",b :" +b);
    }
}
