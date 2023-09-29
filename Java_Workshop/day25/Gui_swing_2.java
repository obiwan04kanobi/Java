package day25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui_swing_2 {
    public static void main(String[] args) {
        Abc_2 obj = new Abc_2();
    }
}

class Abc_2 extends JFrame implements ActionListener{

    JTextField t1,t2;
    JButton b;
    JLabel l,l2;

    public Abc_2(){
        setLayout(new FlowLayout());
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b = new JButton("Click Me");
        l = new JLabel("Result is: ");
        l2 = new JLabel("Enter two numbers");
        add(l2);
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.getActionListeners();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = num1 + num2;
        l.setText(value + "");
        
    }
}
