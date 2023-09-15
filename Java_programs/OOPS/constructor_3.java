
class Base{

    //default constructor
    Base(){
        System.out.println("in Base class");
    }

    Base(int x){
        System.out.println("i am an overloaded constructor with value of x as: "+x);
    }
}

class Derived extends Base{

    Derived(){
        System.out.println("in Derived class");
    }

    Derived(int x,int y){
        super(x);
        System.out.println("i am an overloaded constructor of Derived with value of y as: "+y);
    }

}

class ChildOfDerived extends Derived{

    ChildOfDerived(){
        System.out.println("i am a child of Derived Constructor");
    }

    ChildOfDerived(int x,int y,int z){
        super(x, y);
        System.out.println("i am an overloaded constructor of ChildOfDerived with value of z as: "+z);
    }

}


public class constructor_3 {
    public static void main(String[] args) {
        //Base b = new Base();
        //Derived d = new Derived(14,5);
        //ChildOfDerived cd = new ChildOfDerived(13,54,35);

    }
}
