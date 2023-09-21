package day19;
import java.util.*;

/*
 * Assertion is a statement in java. It can be used to test your assumptions about the program.
 * While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError.
 * It is mainly used for testing purpose.
 * It is enabled by -ea or -enableassertions switch of java.
 * Steps:
 * 1. javac assertion_1.java
 * 2. java -ea assertion_1
 */

public class assertion_1 {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        assert val >= 18 : "Not valid";
        System.out.println("Value is " + val);
    }
}
