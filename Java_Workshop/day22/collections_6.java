package day22;
import java.util.*;
public class collections_6 {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<String>();
        as.add("Java");
        as.add("Python");
        as.add("C#");
        System.out.println("Elements"+as);
        Collections.addAll(as,"HTML","DSA","JS","CSS","RDMS","REACT"); //addAll() method adds all the elements of specified collection to the list
        System.out.println(as);
        System.out.println("Index value: "+as.get(4)); //get() method returns the element at the specified position in the list
        as.set(4,"Algorithm"); //set() method replaces the element at the specified position in the list with the specified element
        System.out.println("Updated list: "+as);
        as.remove("C#"); //remove() method removes the first occurrence of the specified element from the list
        System.out.println(as);
        as.remove(2); //remove() method removes the element at the specified position in the list
        System.out.println(as);
    }
}
