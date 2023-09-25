import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
    }
}
