
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}   



public class dynamic_method_dispatch_1 {
    public static void main(String[] args) {
        //Phone obj = new Phone();

        // refrence hai Parent class ka and object has Child class ka
        Phone obj2 = new SmartPhone(); //Allowed because every SmartPhone is a Phone
        //SmartPhone obj3 = new Phone(); //Not Allowed because every Phone is not a Smartphone 

        obj2.on(); // method "on" of Child-class will run because "on" method is also in Parent-class
        obj2.showTime(); // method "showTime" of Parent-class will run
        //obj2.music(); // method "music" of Child-class will not run because it is not present in Parent-class
    }   
}
