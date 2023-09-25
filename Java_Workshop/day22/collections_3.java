package day22;

import java.util.*;

public class collections_3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Batch 2");
        al.add("Khalid");
        al.add("Mayank"); 
        al.add("Rajeev");
        al.add("Kashif");
        System.out.println("All Elements "+al);       
        System.out.println("Elements in Alertnative Positions");

    //printing elements in alternative positions.
        Iterator it = al.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                if (it.hasNext()) 
                {
                    it.next();
                }           
        }
    }
}
