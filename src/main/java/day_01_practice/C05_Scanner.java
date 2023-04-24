package day_01_practice;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

 /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner scan =new Scanner(System.in);

        System.out.println("Adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("Soy adinizi giriniz");
        String soyad = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Boyunuzu giriniz");
        int boy = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo = scan.nextInt();

        System.out.println("Adi :"+ad +"\nSoyadi : "+soyad +"\nYas :" +yas +"\nBoy : "+boy +"\nKilo : "+kilo);





    }
}
