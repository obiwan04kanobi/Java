
interface Bicycle{
    int a = 45;
    void applyBrake(int Decrement);
    void speedUp(int incerement);
}

class Hero_cycle implements Bicycle{

    public int speed = 7;
    
    public void applyBrake(int Decrement){
        speed -= Decrement;
        System.out.println("Bicycle Speed Decreased to: "+speed);
    }

    public void speedUp(int incerement){
        speed += incerement;
        System.out.println("Bicycle Speed Incereased to: "+speed);
    }

}

public class interface_1 {
    public static void main(String[] args) {
        Hero_cycle cy = new Hero_cycle();
        cy.applyBrake(4);
        cy.speedUp(2);

        //you can create properties in interfaces. You cannot modify the properties in interfaces because they are final
        System.out.println(cy.a);
    }
}
