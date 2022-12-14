package ders33_InheritanceDataTypeKullanimi_Overriding;

import java.lang.reflect.AnnotatedArrayType;

public class Corolla extends BToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";
    int yil=2023;

    public static void main(String[] args){
        /*
         bir obje olusturulurken
         data turu ve contructor ayni class'dan ise
         bir variable'in degerini bulmak icin
         o class'a gideriz
         o class'da yoksa parent class'lara bakilir
         ilk bulunan kullanilir
        */

        Corolla corolla1=new Corolla();

        System.out.println(corolla1.model); // Corolla=(class adi)
        System.out.println(corolla1.uretimYeri); // Corolla=(class adi)
        System.out.println(corolla1.yil); // Corolla=(class adi)
        System.out.println(corolla1.marka); // BToyota=(class adi)
        System.out.println(corolla1.motor); // Araba=(class adi)
        System.out.println(corolla1.plaka); // Araba=(class adi)
        System.out.println(corolla1.yakit); // BToyota=(class adi)

        System.out.println("--------------------------");

        BToyota corolla2=new Corolla();

        /*
        Obje olusturulurken
        data turu ve constructor farkli ise
        variable'in degerini bulmak icin
        Data turu olan class'a gidilir
        varsa kullanilir, yoksa o class'in parent'larina bakilir
        bulunamazsa CTE verir
        (ama geri vites atmaz)
         */

        System.out.println(corolla2.model); // BToyota=(class adi)
        // System.out.println(corolla2.uretimYeri); // CTE VERIR
        System.out.println(corolla2.yil);   // BToyota=(class adi)
        System.out.println(corolla2.marka); // BToyota=(class adi)
        System.out.println(corolla2.motor); // Araba=(class adi)
        System.out.println(corolla2.plaka); // Araba=(class adi)
        System.out.println(corolla2.yakit); // BToyota=(class adi)

        Araba corolla3= new Corolla();

        // System.out.println(corolla3.model);      // CTE VERIR
        // System.out.println(corolla3.uretimYeri); // CTE VERIR
        // System.out.println(corolla3.yil);        // CTE VERIR
        // System.out.println(corolla3.marka);      // CTE VERIR
        System.out.println(corolla3.motor);         // Araba=(class adi)
        System.out.println(corolla3.plaka);         // Araba=(class adi)
        System.out.println(corolla3.yakit);         // BToyota=(class adi)

        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka); // BToyota
        System.out.println(toyota1.model); // BToyota
        System.out.println(toyota1.motor); // Araba
        System.out.println(toyota1.plaka); // Araba
        System.out.println(toyota1.yil);   // BToyota
        System.out.println(toyota1.yakit); // BToyota

        Araba toyota2= new BToyota();

       // System.out.println(toyota2.marka); // CTE VERIR
       // System.out.println(toyota2.model); // CTE VERIR
        System.out.println(toyota2.motor); // Araba
        System.out.println(toyota2.plaka); // Araba
       // System.out.println(toyota2.yil);   // CTE VERIR
        System.out.println(toyota2.yakit); // BToyota

        Araba araba=new Araba();
        System.out.println(araba.motor); // Araba
        System.out.println(araba.plaka); // Araba
        System.out.println(araba.yakit); // Araba

    }
}
