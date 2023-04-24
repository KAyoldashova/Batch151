package day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;

    //Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Data'yi nasil saklarsin? Access Modifier'ini "private" yaparak.
    private String stdId = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    public String getStdId() {
        return stdId;
    }
    public double getGpa() {
        return gpa;
    }
    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar
    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz.
    //Nasil degistirebilirz? "set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
