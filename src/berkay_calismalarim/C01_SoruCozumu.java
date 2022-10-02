package berkay_calismalarim;

public class C01_SoruCozumu {
    public static void main(String[] args) {
        /*2. Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
        calculate result of n1&n2 based on the given math Operator.
        char operator -> -, +, *, /
        when operator is + : add num1, num2
        when operator: - : minus num1, num2
        when operator: * : multiply num1, num2
        when operator: / : divide num1, num2
        for any other operators: print "invalid operator"
        Ex:
        n1 = 10, n2= 20, mathOperator = '+'
        output:
        30
        */

        double n1=30;
        double n2=15;
        char operator='*';
        double sonuc=0;


        if (operator=='+'){
            System.out.println(n1+n2);
        } else if (operator=='*') {
            System.out.println(n1*n2);

        } else if (operator=='-') {
            System.out.println(n1-n2);

        } else if (operator=='/') {
            System.out.println(n1/n2);

        } else {
            System.out.println("yaptiginiz islem hatali");
        }
        System.out.println();

    }
}
