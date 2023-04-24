package day04memorykullanimiwrapperclass;

public class C01_MemoryninKullanimi {


  /*

    Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran primitve data typelarinin non primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,durum) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****


     */

    public static void main(String[] args) {

         byte prinitiveByte = 12;
         Byte wrapperByte =12;

        // byte data type'inin en buyuk ve en kucuk degerini ekrana yazdirin

        System.out.println(Byte.MAX_VALUE);
        System.out.println( Byte.MIN_VALUE);


      //  System.out.println(Integer.MAX_VALUE);
        // System.out.println(Byte.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE+Byte.MIN_VALUE);

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("toplam = " + (intMax+byteMin));

        //****** Primitive Data  Type'larini Wrapper Classlara Nasil Ceviririz****


















    }// main


}//class
