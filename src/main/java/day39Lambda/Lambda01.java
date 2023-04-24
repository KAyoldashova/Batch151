package day39Lambda;
import java.util.ArrayList;
import java.util.List;
public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();


//jfjfjava void java my
    }



    public static void printElements(List<String>myList){
        for (String w : myList){
            System.out.println(w + " ");
        }

    }
    public static void printEl (List<String>myList){
        myList.stream().forEach(t -> System.out.println(t + " "));


    }

    public static void printElExceptStarsWithT(List<String>myList){


    }


}
