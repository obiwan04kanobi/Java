
interface lambda{
    void lambda_1(String name);
}

/* class lambda_example implements lambda{
    @Override
    public void lambda_1(){
        System.out.println("inside lambda_example");
    }
} */

public class lambda_expressions_1 {
    public static void main(String[] args) {

        //General way of implementing a interface
/*         lambda l = new lambda_example();
        l.lambda_1(); 
*/

        // Using lambda functions

        lambda l = (String name)->{
            
            System.out.println("inside lambda function");
            System.out.println("hello, "+name);
        };
        l.lambda_1("Harry");

    }
}
