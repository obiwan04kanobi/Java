package day8;

//PUBLIC ACCESS SPECIFIERS
class data{

    void call(){

        System.out.println("Hello");

    }

}
public class access_specifiers_1 {
    public static void main(String[] args) {
        data d = new data();
        d.call();
    }
}