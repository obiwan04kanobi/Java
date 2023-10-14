package day8;

import java.util.*;

import java.lang.Math;

class input{
    public int side;
    public double radius;
    
    Scanner sc = new Scanner(System.in);
    void square_input(){
        System.out.print("Side length: ");
        side = sc.nextInt();
    }

    void circle_input(){
        System.out.print("Radius: ");
        radius = sc.nextDouble();
    }
}

class Calculate extends input{
    int square_area(){
        super.square_input();
        return side * side;
    }

    public double circle_area;
    double circle_area(){
        super.circle_input();
        circle_area = Math.PI * (radius * radius);
        return circle_area;
    }
}

public class super_keyword_3 {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println("Area of Square: "+cal.square_area());
        System.out.println("Area of Circle: "+cal.circle_area());
    }
}
