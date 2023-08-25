package day3;

public class sum3 {

    public int addNumbers(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        sum3 obj = new sum3();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: "+result);        
    }
}
