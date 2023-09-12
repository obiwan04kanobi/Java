package day15;

@FunctionalInterface
interface See_7{
    abstract void csds(int i);
}

public class lambda_1{
    public static void main(String[] args) {
        See_7 A = (int i) ->System.out.println("Team Hi!!");
        A.csds(5);
    }
}