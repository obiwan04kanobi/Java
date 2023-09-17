package day2;
public class bitwise_logical_operators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println(x&&y);   //false
        System.out.println(x||y);   //true
        System.out.println(!(x&&y)); //true
        System.out.println(x^y);    //true
    }
}
