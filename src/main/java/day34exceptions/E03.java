package day34exceptions;

public class E03 {
    public static void main(String[] args) {
        System.out.println(getMumOfChars("Java"));//4
        System.out.println(getMumOfChars("Money"));//5
        System.out.println(getMumOfChars(""));
        System.out.println(getMumOfChars("null"));


    }

    // Bir String'deki eleman sayisini veren  method  olusturunuz.

    public  static int getMumOfChars (String s){
        return s.length();
    }






}
