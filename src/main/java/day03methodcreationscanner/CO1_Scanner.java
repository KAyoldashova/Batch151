package day03methodcreationscanner;

import java.util.Scanner;

public class CO1_Scanner {
    public static void main(String[] args) {

    /*
    Kullanicidan data almak icin Scanner Classi kullanilir ve bir input/scan/ scanner objesi olusturulur
    bu objeyi  new key worduyle olusturunuz
     */
        // 1 )Adim Object Olusturma

        Scanner input = new Scanner(System.in); //Togahan

        // 2 ) kullaniciya ne yepacagini soyluyoruz

        System.out.println("Lutfen masinizi giriniz ");

        // 3 ) Adim kullanicidan alinan datalar yapisina ve
        // buyuklugune gore bir Variable'a yerlestirilir

        long maas = input.nextLong();
        //4 )  Kullanicini verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz

        System.out.println("maas = " + maas);


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini soran bir program yaziniz

        System.out.println("Lutfen cinsiyetinizi Kadin ise K Erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);//erkek


        System.out.println("Lutfen adinizi giriniz");
        // String isim = input.next();
        String name = input.next();//Tolgahan Metehan

        System.out.println("Lutfen su an bulundugunuz ulkeyi  giriniz");
        String memleket= input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/ False seklinde giriniz");
        boolean seviyorMu= input.nextBoolean();

        System.out.println("*************** Aysluv *****************");
        System.out.println("cinsiyet = "+cinsiyet+"\nname==> "+name+"\nmemleket : "
                +memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu);






    }//main

}//class

