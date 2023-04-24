package printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint {
    public static void main(String[] args) {

        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde yazdiriniz

        //1 Yol

        //ctrl +d ==> windows
        // cmd +d ==> mac
        System.out.println("**********1 .YOL ********************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        // 2 Yol
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt tek bir sout ile yazdiriniz

        System.out.println("  T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN  ");

      // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
      // yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz
        //JAVA 1 ==> 1 SPACE BOSLUK
        //JAVA 1 ==>  1 TAB BOSLUK
        System.out.println(" JAVAM\tILEMM\tGUZEL\tDUNYA");
        // \t de harf sayisi onemlidi yoksa esit aralik birakmaz
       // bu nedenle her kelimeyi 5 harfe tamamladik

        //"Techpro" ile java cok 'kolay'
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println(" Techpro ile  java cok kolay ");

        System.out.println("\"Techpro \" ile java cok ' kolay '");

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        System.out.println("\" MAHARET\" hic " +
                "'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"" );
        // print ile Println arasindaki farklar

        System.out.println(" **************** 1 *****************");
                        System.out.print("Ali");
        System.out.println("Can");
        // AliCan yazdir
        System.out.println("  **************** 2 ***************** ");
        System.out.println("Ali");
        System.out.println("Can");
        //Ali
        //Can yazdir

        System.out.println(" **************** 3 ***************** ");
        System.out.println("Ali");
        System.out.println("Can");
        //
        //

        /*
              A
             A A
            A A A

         */

        Scanner input = new Scanner( System.in);
        System.out.println(" Lutfen bir karekter  veriniz ");
     // int sayi = input.nextInt();
        //  long a = input.nextLong();
        //   short b = input.nextShort();


        char ch = input.next(). charAt(0); // Ali HAKKI
        System.out.println("  "+ch+"  ");
        System.out.println("  "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);



    }//main
}//class
