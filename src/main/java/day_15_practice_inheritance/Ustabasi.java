package day_15_practice_inheritance;

public class Ustabasi  extends  Isci{
    public static void main(String[] args) {

        Ustabasi ustabasi1 = new Ustabasi();

       ustabasi1 .isim="Murat";
       ustabasi1.soyisim="Gokce";
       ustabasi1.saatUcreti=15;
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1.isim);
        System.out.println(ustabasi1.soyisim);

        System.out.println(ustabasi1.toString());


    }


}
