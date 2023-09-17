package day4;

abstract class bus_2 {
    abstract void accelerate();
}
class volvo extends bus_2{
    void accelerate(){
        System.out.println("Volvo: accelerate");
    }
}
class bus{
    public static void main(String[] args) {
        bus_2 obj = new volvo(); // Bus object ==> contents of Volvo
        obj.accelerate(); //Call the method
    }
}
