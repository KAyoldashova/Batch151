package day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {

         /*
        If Statement () yapisi bazen kodlarin calismasi belirli kosullara baglidir.
        Mesela cok calisirsam, Java ogrenecegim.
        Java ogrenme eylemi cok calisma eylemine baglanmistir.
        1.eylem gerceklesmedden ikinci eylem gerceklesmez.
        if(){}
        ()  parantez icine sart yazilir eger true dondururse { } body arasindaki
        kod calisir.Aksi halde if body disina cikar class'ta sonraki kodlari
        okumaya devam eder.

         */

        // INTERWIEW QUESTIONS USA QA
         // String str ="abbccdc" tekrarsiz karakterleri ekrana yazdiriniz
        String str ="aac";


       char ch =str.charAt(0);
       if (str.indexOf(ch) == str .lastIndexOf(ch)){
           System.out.println(ch);
       }// if body

        char ch1 =str.charAt(1);
        if (str.indexOf(ch1) == str .lastIndexOf(ch1)){
            System.out.println(ch1);

        }// if body


            char ch2 =str.charAt(2);
            if (str.indexOf(ch2) == str .lastIndexOf(ch2)) {
                System.out.println(ch2);
            }  // if body //c
         // Ex : Sayi pozitif ise ekrana "Pozitif Sayi" yazdiran kodu yaziniz

        int num =0;
        if(num>0){
            System.out.println( "Pozitif Sayi");// Pozitif Sayi
        }

        //Ex: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz
        //0 1 2 3 4 5 6 7 8 9 ==> Rakam

        System.out.println("*************");
        int number =12;

        if(num>-1 && num<10){
            System.out.println("Rakam");
        }

/*


Math Classi onemli bir Class;tir.Icerisinde bir cok method barindirir.
abs() methoduda icerisine arguman olarak verilen sayinin mutlak
degerini yani pozitif halini verir

*/
        int n= -234;

        n = Math.abs(n);
        if(n>99 && n<1000){
            System.out.println("Sayi 3 Basamaklidir");
        }


    }//main

}// class
