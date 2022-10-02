package day_44_Maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-B-TM");
        ogrenciMap.put(104,"Ayca-Can-11-B-MF");
        ogrenciMap.put(105,"Ayse-Cem-10-M-Soz");
        return ogrenciMap;
    }
    public static Map<Integer,String> mapeOgrenciEkle(Map<Integer,String> ogrenciMap){
        Scanner scan = new Scanner(System.in);
        String valueOgr="";
        System.out.println("Ogrenci ismi giriniz");
        String isim = scan.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println("Ogrenci soy ismi giriniz");
        String soyisim= scan.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        System.out.println("Ogrenci sinif giriniz");
        String sinif= scan.nextLine();
        System.out.println("Ogrenci sube giriniz");
        String sube= scan.nextLine().toUpperCase();
        System.out.println("Ogrenci brans giriniz MF-TM-Soz");
        String brans= scan.nextLine();
        brans=brans.substring(0,1).toUpperCase()+brans.substring(1).toLowerCase();
        valueOgr=isim+"-"+soyisim+"-"+sinif+"-"+sube+"-"+brans;
        System.out.println("Ogrenci no giriniz: ");
        int keyOgr= scan.nextInt();
        ogrenciMap.put(keyOgr,valueOgr);
        return ogrenciMap;
    }

    public static List<String> bransdakiOgrencilerListesi(Map<Integer, String> ogrenciMap, String brans) {

        List<String> bransdakiOgrenciList=new ArrayList<>();

        Collection<String> bransOgrenciValueColl=ogrenciMap.values();
        String[]tempArr;

        for (String each: bransOgrenciValueColl
             ) {
            tempArr=each.split("-"); // (Ali,Can,10,H,MF]
          if (tempArr[4].equalsIgnoreCase(brans)) {
              bransdakiOgrenciList.add(tempArr[0]+" "+tempArr[1]);
          }
        }
        return bransdakiOgrenciList;
    }

    public static List<String> siniftakiogrenciListesiOlustur(Map<Integer, String> ogrenciMap, int sinif) {

        List<String> siniftakiOgreciListesi=new ArrayList<>();
        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        String[] tempArr;
        for (String each: ogrenciValueCollection
             ) {
            tempArr=each.split("-"); // [Ali,Can,10,H,MF]

            if(tempArr[2].equals(sinif+"")) {
                siniftakiOgreciListesi.add(tempArr[0]+" "+tempArr[1]);
            }
        }
        return siniftakiOgreciListesi;
    }
}
