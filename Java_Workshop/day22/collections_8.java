package day22;

import java.util.*;

public class collections_8 {
    public static void main(String[] args) {
        //in this program we will see how to convert ArrayList to Array
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(12);
        li.add(23);
        li.add(345);
        System.out.println(li);
        int n = li.size();
        Object arr[] = new Object[n];
        li.toArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
