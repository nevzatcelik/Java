package day41_Interfaces;

public class KKepekliEkmek implements I01_IntefacesEkmek,I02_UnluMamuller{

    @Override
    public void un() {
        System.out.println("Kepekli ekmekte %30 kepek iceren un kullanilir");

    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 oraninda maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farlkli bicimlerde olabilir");

    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");


    }

    @Override
    public void yabanciMadde() {

    }

    @Override
    public void standartNo() {

    }
}
