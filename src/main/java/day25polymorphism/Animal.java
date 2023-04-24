package day25polymorphism;

public class Animal {

public  void move () {

    System.out.println("Animals move...");

}

public int add(int a, int b){
    return a+b;
}
public Animal create(){
    return new Animal();

}

}
