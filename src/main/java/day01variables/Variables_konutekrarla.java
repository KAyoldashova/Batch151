package day01variables;

import java.util.Scanner;

public class Variables_konutekrarla {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);

        System.out.println(" Lutfen cinsiyetiniz Kadin ise K Erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);

        System.out.println(" Lutfen adinizi giriniz");
        String name = input.next();

        System.out.println(" Lutfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println(" Lutfen su an bulundugunuz ulkeyi giriniz ");
        String ulke = input.next();

        System.out.println(" Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/ Flase seklinde giriniz");
        boolean sevyorMu = input.nextBoolean();

        System.out.println("Lutfen bulundugunuz ulkeye not birakin");
        String memleketNot = input.next();

        System.out.println("**********Aysluv*******");

        System.out.println(" cinsiyet = " + cinsiyet+ " \nname===> " +name+ "\nmemleket : "+memleket+ "\n seviyorMu: " + sevyorMu);


    }



    }

