package day21;

import java.util.*;

/*
 * Generics is a feature that allows us to create classes, interfaces and methods
 * that take types as parameters. These parameters are called type parameters. 
 *  - A class, interface or method that operates on a parameterized type is called
 *   generic class, generic interface or generic method.
 * - The idea is to allow type (Integer, String, … etc, and user-defined types)
 * to be a parameter to methods, classes and interfaces. For example, classes
 * like HashSet, ArrayList, HashMap, etc use generics very well. We can use them
 * for any type.
 */


public class generics_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        Integer s = list.get(0);
        System.out.println(s);
        System.out.println(list);
    }
}
