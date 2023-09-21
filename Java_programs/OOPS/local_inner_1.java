
class Outer_2{
    int num = 1969;
    void show(){
        class Inner_2{
            void display_2(){
                System.out.println("Local inner");
            }
        }
        Inner_2 l = new Inner_2();
        l.display_2();
    }
}

public class local_inner_1 {
    public static void main(String[] args) {
        Outer_2 o2 = new Outer_2();
        o2.show();
        System.out.println(o2.num);

    }
}
