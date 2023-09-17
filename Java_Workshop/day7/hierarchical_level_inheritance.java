import java.util.Scanner;

class Perform{

    int length,breadth;
    void input_rectangle(){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Length: ");
        length = sc.nextInt();
        System.out.print("Breadth: ");        
        breadth = sc.nextInt();


    }

    int side_length;
    void input_square(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Length of each side: ");
        side_length = sc.nextInt();

    }


}

class Rectangle_2 extends Perform{

    void input(){
        input_rectangle();
    }
    
    int perimeter_rectangle;
    int perimeter(){

        perimeter_rectangle = 2*(length+breadth);
        return perimeter_rectangle;
    }

    int area_rectangle;
    int area(){

        area_rectangle = length * breadth;
        return area_rectangle;

    }
}

class Square extends Perform{

    void input(){

        input_square();
    }

    int perimeter_square;
    int perimeter(){

        perimeter_square = 4*side_length;
        return perimeter_square;
    }

    int area_square;
    int area(){

        area_square = side_length*side_length;
        return area_square;
    }

}


public class hierarchical_level_inheritance {
    public static void main(String[] args) {
        
        Rectangle_2 r = new Rectangle_2();
        Square s = new Square();

        r.input();

        System.out.println("Perimeter of Rectangle: "+ r.perimeter());
        System.out.println("Area of Rectangle: "+r.area());

        s.input();

        System.out.println("Perimeter of Square: "+ s.perimeter());
        System.out.println("Area of Square: "+s.area());
    }
}
