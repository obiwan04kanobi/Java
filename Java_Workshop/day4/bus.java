package day4;

abstract class bus_2 {
    abstract void accelerate();
}

class volvo extends bus_2{
    
    void accelerate(){
        System.out.println("Volvo: accelerate");
    }

    void deaccelerate(){
        System.out.println("Volvo: deaccelerate");
    }
}

class bus{
    public static void main(String[] args) {
        bus_2 obj = new volvo(); // Bus object ==> contents of Volvo
        obj.accelerate(); //Call the method
       //obj.deaccelerate();    --> gives an error because we are creating object with taking reference of bus_2 so we can only implement methods that are inside bus_2
    }
}
