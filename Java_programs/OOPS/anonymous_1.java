
abstract class Bus{
    abstract void accelerate();
    abstract void deaccelerate();
}

public class anonymous_1 {
    public static void main(String[] args) {
        Bus speed = new Bus() {
            void accelerate(){
                System.out.println("Bus accelerate");
            }
            
            void deaccelerate(){
                System.out.println("Bus deaccelerate");
            }
        };
        speed.accelerate();
        speed.deaccelerate();
    }
}
