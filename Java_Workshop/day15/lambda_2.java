package day15;

interface Addable{
    int add(int a,int b);
}

public class lambda_2 {
    public static void main(String[] args) {
        Addable a1 = (a,b)->(a+b);
        System.out.println(a1.add(3, 4));

        Addable a2 = (int a,int b)->
        {
            return (a+b);
        };
        System.out.println(a2.add(60, 12));
    }
}
