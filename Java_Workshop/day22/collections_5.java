package day22;
import java.util.*;
/* 
* Write a java code to read floating values using ArrayList and print it using for each loop
*/
public class collections_5 {
    public static void main(String[] args) {
        ArrayList<Float> lis = new ArrayList<Float>();
        //List<Float> lis = new ArrayList<>(); // This is also valid
        lis.add(12.0f);
        lis.add(9.0f);
        lis.add(10.0f);
        lis.add(11.0f);
         System.out.println("With Generics");
        for(Float s :lis) 
        {
            System.out.println(s);
        }
        System.out.println("Size of the ArrayList is: "+lis.size()); 
        
        System.out.println("\nIn reverse order:");
        ListIterator<Float> itr = lis.listIterator(lis.size());
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

    }
}
