package day22;

import java.util.*;

public class collections_2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        //here we are using generics, hence we are specifing the data type, so we can only add elements of that data type in it.
        al.add(56);
        //al.add("9"); //will give error as we are trying to add a string in an arraylist of integer type
        al.add(89);
        al.add(12);
        al.add(34);
        System.out.println("Elements "+al);
        
        System.out.println("Iterating Elements");
        Iterator it = al.iterator(); //iterator is used to iterate over the elements of an arraylist
        while(it.hasNext()) { //hasNext() is used to check if there is any element left in the arraylist
            System.out.println(it.next()); //next() is used to print the next element in the arraylist
        }
    }
}
