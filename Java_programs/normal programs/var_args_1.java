

public class var_args_1 {

    // we can pass "n" number of arguments in this function and it will return the sum of all
    static int sum(int ...arr){
        int result = 0;

        for(int a: arr){    // it is read as => "for int a in array"
            result += a;
        }
        return result;
    }


    public static void main(String[] args) {


        System.out.println("the sum is "+sum(1,2,3,4));
    }
}
