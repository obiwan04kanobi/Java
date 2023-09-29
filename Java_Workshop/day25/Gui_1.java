package day25;

import java.awt.*;
import java.awt.event.*;


public class Gui_1 extends Frame
{

    Frame f1;
    Label l1;
    Button b1;
    Button b2;
    public Gui_1()
    {
        f1 = new Frame("Welcome to Framework");
        l1 = new Label("Hi");
        f1.setSize(500,400);
        f1.setLayout(new FlowLayout());
        f1.setLayout(new GridLayout(1,1));

        b1 = new Button("Click Me");
        b2 = new Button("Exit");
        f1.add(l1);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);

        f1.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Gui_1 f1 = new Gui_1();
    }
}
