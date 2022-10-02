package day40_abstractClasses;

public class FCiceKEkmek extends CAbstractEkmek{
    @Override
    public void un() {
        System.out.println("Cicek ekmekte beyaz un kullanilir");

    }

    @Override
    public void maya() {
        System.out.println("Cicek ekmekte binde 2 maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Cicek ekmek cicek biciminde olur");

    }

    @Override
    public void gramaj() {
        System.out.println("cicek ekmek 350 gramdir ");

    }

    @Override
    public void tuz() {
        System.out.println("Cicek ekmekte binde 1 tuz kullanilir");
    }

}
