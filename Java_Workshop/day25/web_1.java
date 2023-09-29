package day25;

import java.awt.*;
//import java.awt.event.*;

public class web_1 extends Frame
{

    Frame f1;
    Label l1;
    public web_1()
    {
        f1 = new Frame("Welcome to Framework");
        f1.setLayout(new FlowLayout());
        f1.setSize(500,400);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        web_1 f1 = new web_1();
    }
}
