
import java.lang.String;

// NOTE: STRING IS IMMUTABLE

public class string_methods_1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s5 = "HELLO";
        String s6 = "        hello       ";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        char [] ch = s1.toCharArray(); // converting from String object to char datatype
        float value = 30.545f;

        System.out.println(s1==s2); //its checking its memory address not its value 

        System.out.println(s1 == s3); // its checking its memory but, this time the memory address are different since s3 is a new object with a new memory address

        System.out.println(s1.charAt(0));

        // "0" means true and "-ve" numbers means false
        System.out.println(s3.compareTo(s4)); //it is comparing the both on the basis of the sum of the ASCII values of each character

        System.out.println(s3.concat(s4)); // concatenates the both strings

        System.out.println(ch);
        
        System.out.println(String.valueOf(value)+10); // concatenates because 30 is now string not integer

        System.out.println(s5.toLowerCase()); // similarly for uppercase

        System.out.println(s6.trim()); // trims whitespace before or after a string
    }
}
