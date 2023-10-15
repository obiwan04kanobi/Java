package day18;

import java.util.StringTokenizer;

public class string_tokenizer_1{
    public static void main(String[] args) {
        
        StringTokenizer st = new StringTokenizer("Hello Stduents of Batch-2");

        // using while loop to print tokens because the String has more than one token/word in it.
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); //breaks the words of the sentence in tokens by default at spaces
        }
    }
} 