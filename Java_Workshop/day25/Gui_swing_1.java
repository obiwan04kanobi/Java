package day25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui_swing_1 {
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}

class Abc extends JFrame{
    public Abc(){
        setLayout(new FlowLayout());
        //(JLabel) to show something on the screen
        JLabel l = new JLabel("Hello world");
        JLabel l1 = new JLabel("Welcome to class");
        add(l);
        add(l1);
        setVisible(true);
        setSize(500,400);
        
    }
}