package day04_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

                //Dataları, değerleriyle yazalım
                String s1= "Java";
                String s2= " ";
                String s3= "kolay";
                String s4= "";

                int a= 3;
                int b= 4;
        /* 12 Java kolay= ((a*b)+s2+s1+s2+s3)
        7 Java kolay=((a+b)+s2+s1+s2+s3)
        34Java kolay=(a+s4+b+s1+s2+s3)
        Java12kolay=s1+s4+(a*b)+s4+s3
        Java34kolay=s1+(a+s4+b)+s3
        Java7kolay=s1+s4+(a+b)+s4+s3
        */


        System.out.println((a*b)+s2+s1+s2+s3); // 12 Java kolay
        System.out.println((a+b)+s2+s1+s2+s3);
        System.out.println(a+s4+b+s1+s2+s3);
        System.out.println(s1+s4+(a*b)+s4+s3);
        System.out.println(s1+(a+s4+b)+s3);
        System.out.println(s1+s4+(a+b)+s4+s3);
        System.out.println(s1+(a+b)+s3);







        System.out.println("--------------------------------------------------------------------");











                System.out.println(a*b+s2+s1+s2+s3);
                System.out.println(a+b+s2+s1+s2+s3);
                System.out.println(s4+a+b+s1+s2+s3);
                System.out.println(s1+a*b+s3);
                System.out.println(s1+a+b+s3);
                System.out.println(s1+(a+b)+s3);

    }
}
