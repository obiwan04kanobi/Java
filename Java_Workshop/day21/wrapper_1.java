package day21;

/*
 * Wrapper class : boxing, unboxing
 * boxing : primitive type -> wrapper class
 * Auto boxing : primitive type -> wrapper class
 * unboxing : wrapper class -> primitive type
 * 
 * wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean
 * 
 */

public class wrapper_1 {
    public static void main(String[] args) {
        int i = 100;
        Integer iobj1 = Integer.valueOf(i);  // boxing
        Integer iobj2 = i; // auto boxing
        System.out.println(iobj1);   
        System.out.println(iobj2); 
        System.out.println(iobj1+iobj2); // unboxing + unboxing = primitive type + primitive type = primitive type
    }
}
