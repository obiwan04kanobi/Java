package day22;

import java.util.*;

public class collections_4 {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add(12);
        li.add("NIET");
        li.add("Pyramid");
        li.add(9);
        System.out.println("\nWithout Generics");
        
        //for each loop
        for(Object s :li)
        {
            System.out.println(s);
        }

        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(12);
        lis.add(9);
        lis.add(10);
        lis.add(11);
        System.out.println("\nWith Generics");
        for(Integer s :lis) 
        {
/*             if we have a ArrayList of different datatypes and if we want only to print 
            Integer datatypes from the ArrayList then we can use ( Integer s:lis) in the for each loop
 */
            System.out.println(s);
        }
    }
}
