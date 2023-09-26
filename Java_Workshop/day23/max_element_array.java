package day23;
import java.util.*;
/*
 * write a java code to print the maximum element from a array list
 */
public class max_element_array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        int max = list.get(0);
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}