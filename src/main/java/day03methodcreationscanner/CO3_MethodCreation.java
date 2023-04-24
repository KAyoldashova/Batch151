package day03methodcreationscanner;

public class CO3_MethodCreation {
   /*


    Javada method nasil olusturulur?

    1) Javada method main'in disinda olusturulur
    2) tekrar tekra kullanmamiz gerekiyorsa method olustururuz
     Access Modifier  +  Return Type + methodIsmi  + ( ) + { }
     islem yapilacak olan sayilari methodIsmi () parantezin icine eklenir


    Scope == Kapsam Alani bir variable'in  bir degerin,
     hangi alanda kapsam icinde oldugunu gosterir

     //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
// ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.


     */

    public static void main(String[] args) {

        // 1) Verilen iki sayiyi toplayan methodu olusturunuz
        toplamaYap(30, 87);
        // Verilen 2 sayiyi carpan methodu yaziniz
        multiply(46, 12);
        System.out.println(firstTwoMultipLyThirdAdd(2,3,5)*2);
    }//main

    public static int firstTwoMultipLyThirdAdd(int a, int b, int c) {
        return a* b +c;
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    static void toplamaYap(int a, int b) {
        // Access modifiers default oldugu icin bir sey yazilmadi
        System.out.println(a + b);

    }


}//class