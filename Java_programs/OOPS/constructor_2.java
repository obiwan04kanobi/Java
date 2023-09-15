import java.util.Scanner;

class Cylinder{
    public double pie = 3.14159265359;
    private int radius;
    private int height;

    //constructor
    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    double surface_area(){
        return (2 * pie * radius * height) + (2 * pie * (radius * radius));
    }

    double volume(){
        return (pie * (radius * radius) * height);
    }
}

class Rectangle{

    private int length;
    private int breadth;

    // default constructor
    Rectangle(){
        length = 4;
        breadth = 5;
    }

    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int getter_length(){
        return length;
    }

    int getter_breadth(){
        return breadth;
    }

}

public class constructor_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = sc.nextInt();
        System.out.print("Height: ");
        int height = sc.nextInt();

        Cylinder cy = new Cylinder(radius, height);

        System.out.println("Cylinder radius: "+cy.surface_area()+ ", Cylinder Volume: "+cy.volume());

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(6,7);
        System.out.println("Rectangle length: "+r.getter_length()+ ", breadth: "+r.getter_breadth());
        System.out.printf("Rectangle length: %d, breadth: %d",r2.getter_length(),r2.getter_breadth());

        sc.close();
    }
}
