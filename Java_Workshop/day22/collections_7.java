package day22;
import java.util.*;
public class collections_7 {
    public static void main(String[] args) {
        ArrayList<Integer> as = new ArrayList<Integer>();
        as.add(48);
        as.add(22);
        as.add(32);
        System.out.println("Without Sorting Elements: "+ as);
        Collections.sort(as);
        System.out.println("With Sorting Elements: "+ as);
        Collections.sort(as,Collections.reverseOrder()); //reverseOrder() method returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface
        System.out.println("With Reverse Sorting Elements: "+ as);
        System.out.println("Cloning: "+ as.clone()); //clone() method returns a shallow copy of the list
        System.out.println("Exist or not: "+ as.contains(22)); //contains() method returns true if the list contains the specified element
        System.out.println("Particular Index: "+ as.indexOf(32)); //indexOf() method returns the index of the first occurrence of the specified element in the list, or -1 if the list does not contain the element
        as.clear(); //clear() method removes all of the elements from the list
        System.out.println("After Clearing: "+ as);

        for (int i = 0; i < 5; i++) {
            as.add(i);
        }

        if(as.isEmpty()){
            System.out.println("List is Empty: "+as.isEmpty());
            System.out.println("Add some elements");
        }
        else{
            System.out.println("List is not Empty: "+as.isEmpty());
            System.out.println(as);
        }

        
    }
}
