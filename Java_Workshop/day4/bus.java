package day4;

abstract class bus {
    abstract void accelerate();
}
class volvo extends bus{
    void accelerate(){
        System.out.println("Volvo: accelerate");
    }
}
class main{
    public static void main(String[] args) {
        bus obj = new volvo(); // Bus object ==> contents of Volvo
        obj.accelerate(); //Call the method
    }
}
