
public class throw_throws {

    /* throws is used when the programmer does not implement try-catch block inside a method/function and 
    *  leaves it to the user to implement it when it calls that function. Whereas, throw is used to simply
    *  thow an exception.
    */
    double result;
    public double divide(double a,double b)throws ArithmeticException{
        
        if (b <= 0){
            throw new ArithmeticException("divide by zero exception");
        }
        
        result = a/b;
        return result;
    }

    double area;
    public double circle_area(double radius)throws ArithmeticException{

        if (radius <= 0){
            throw new ArithmeticException("Radius cannot a be zero or negative number");
        }
        area = Math.PI * radius * radius;
        return area;
    }


    public static void main(String[] args) {

        throw_throws th = new throw_throws();

        try {
            System.out.println("A/B is: "+th.divide(89,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        try {
            System.out.println("Area of Circle is: "+th.circle_area(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
