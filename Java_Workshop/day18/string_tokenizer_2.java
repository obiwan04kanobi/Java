package day18;

import java.util.StringTokenizer;

public class string_tokenizer_2 {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("Hi@Welcome@to@Java@Tokenizer");

        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken("@"));
        }        
    }
}
