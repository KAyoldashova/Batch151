package day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {

    //************************* replaceFirst () ********************\\
    /*
     replaceFirst () : replace () ile ayni isi yapmakla
     birlikte ilk gordugu datayi degistirir
     */
    public static void main(String[] args) {


        String str = "Bizimle Java Ogrenmek Cok kolay";
      String str1 =  str.replaceFirst("i", "e");

        System.out.println("str1 =" + str1);

        String str2 =  str.replaceFirst("i", "e");

        System.out.println("str2 =" + str2);



        // ********************* trim () ***************\\

       /*
       trim ()  Bir String'de bastaki ve
        sondaki space karakterlerini siler .
        Ortadaki space karakterlerine dokunmaz
 /*
        */
// EX : isim String'indeki varsa bas ve sondaki space'leri siliniz

        String isim = "   Mehmet Fatih Yildirim  ";
        String isim1 =isim.trim();
        System.out.println("isim1 = " + isim1);//isim1 = Mehmet Fatih Yildirim
        System.out.println("isim = " + isim);//isim =    Mehmet Fatih Yildirim

        System.out.print("********************");
        System.out.print(isim);
        System.out.print("********************");
        String trimIsim2 = isim.trim();
        System.out.print("trimIsim2 =" + trimIsim2);
        System.out.print("********************");
      // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
      String tv = "599$";
      String laptop = "299$";

      String tv2 = tv.replace("$","");
      System.out.println("tv2 = " + tv2);

      String laptop2 = laptop.replace("$","");
      System.out.println("laptop2 = " + laptop2);
      //$ gordugun yere hicbirsey koyma ; yani $ sembolunu sil
      Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
      System.out.println("totalPrice = " + totalPrice);

/*
        vaueOf()  bize String olan bir datayi sayisal bir
        degere yani islem yapabilecegimiz
        bir degere ceviriyor
         */

      String tamIsim = "Mehmet Fatih";

      //

      Scanner input = new Scanner(System.in);
      System.out.println("Lutfen mail adresinizi\ni)mail adresi \"gmail\" icermeli\n" +
              "               ii)Space characteri mail'de olmamali\n" +
              "               iii)mail adresinde buyuk harf olmamali\n" +
              "               iv)En az bir tane noktalama isareti bulunmali\nveriniz ");



    }//main
}//class
