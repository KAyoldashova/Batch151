package day36exceptions;

public class E03 {

    public static void main(String[] args) {


    }

    // DExample 1:


    public static void printAge (int age){
       if (age<0){
           throw new IllegalArgumentException();

       }

        System.out.println(age);

    }

}

