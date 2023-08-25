package day3;

public class square {
    public static int num_square(int num){
        return num * num;
    }

    public static void main(String[] args) {
        int result;

        result = num_square(10);
        System.out.println("Square of 10");
        System.out.println("Squared value is: "+result);
    }
}
