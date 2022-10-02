package berkay_calismalarim;

public class C07_berkaySORU {
    public static void main(String[] args) {
        String str="JAVA PROGRAMMING LANGUAGE";
        String str1=str.substring(0,str.indexOf(" "));
        String str2=str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String str3= str.substring(str.lastIndexOf(" ")+1);

        System.out.println("ilk kelime = " + str1);
        System.out.println("ikinci kelime = " + str2);
        System.out.println("ucuncu kelime = " + str3);


    }
}
