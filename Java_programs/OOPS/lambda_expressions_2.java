
@FunctionalInterface
interface lambda_sum{
    int sums(int a,int b);
}

@FunctionalInterface
interface lambda_sub{
    int subs(int a,int b);
}


public class lambda_expressions_2 {
    public static void main(String[] args) {

        lambda_sum s1 = (a,b)->(a+b);
        System.out.println(s1.sums(3, 4));

        lambda_sub s2 = (a,b)->(a-b);
        System.out.println(s2.subs(3, 4));

    }
}
