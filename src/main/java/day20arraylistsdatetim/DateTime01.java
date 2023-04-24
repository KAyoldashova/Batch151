package day20arraylistsdatetim;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

     // Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz.
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate ); // 2023- 03- 15

        //Trih'ten istedigimiz bileseni  nasil aliriz.
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);

       int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        // Asagdaki "Month " bir Enum'dir.
        // Enum, Java'da  sabit  degerleri ( Ay isimleri,  Ulkedeki sehir isimleri, Samanyol Galaksisindeki gezegenle sabit isimler)
        // depolamak icin kullanilir.
       Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//

        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4) );

        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));


      LocalDate gokhanDob = LocalDate.of(1986, 6,10 );
       LocalDate fatihDob = LocalDate.of(1985,2,25);

      boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1);//ture

        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2);//ture

        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);//false


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + "invalid date");

        }else {
            System.out.println("Enter time for the ticket");




        }



    }//main

}//class
