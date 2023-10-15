package day22;
import java.util.*;

public class collections_1 {
    @SuppressWarnings("unchecked") //to supress or remove type-safety warnings
    public static void main(String[] args) {
        //not using generics here hence we are not specifing any data type, so we can add any data type in it.
        
        ArrayList al = new ArrayList();
        al.add(12); //used to add elements in arraylist
        al.add("B2");
        al.add(10.54f);
        System.out.println("Elements "+al); //will print all elements in arraylist just like a list in python
    }
}
