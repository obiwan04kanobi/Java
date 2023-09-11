package day14;

class access{
    public int w = 10;
    int x = 45;
    protected int y = 86;
    private int z = 123;

    //can be accessed because in same class
    public void meth(){
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}

public class access_modifiers_1{
    public static void main(String[] args) {
        access ac = new access();
        ac.meth(); //works

        System.out.println(ac.w);
        System.out.println(ac.x);
        System.out.println(ac.y);
        //System.out.println(ac.z); //not works because property is private
    }
   
}