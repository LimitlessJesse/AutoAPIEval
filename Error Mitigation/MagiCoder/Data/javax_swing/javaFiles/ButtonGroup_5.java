import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonGroup_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonGroup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Button 1");
        JRadioButton rb2 = new JRadioButton("Button 2");
        JRadioButton rb3 = new JRadioButton("Button 3");

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        rb1.setSelected(true);

        frame.getContentPane().add(rb1);
        frame.getContentPane().add(rb2);
        frame.getContentPane().add(rb3);

        frame.setVisible(true);
    }
}
