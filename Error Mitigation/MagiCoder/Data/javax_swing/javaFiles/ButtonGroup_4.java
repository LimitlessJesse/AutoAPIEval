import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonGroup_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonGroup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        ButtonGroup group = new ButtonGroup();

        JRadioButton button1 = new JRadioButton("Button 1");
        JRadioButton button2 = new JRadioButton("Button 2");
        JRadioButton button3 = new JRadioButton("Button 3");

        group.add(button1);
        group.add(button2);
        group.add(button3);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        button1.setSelected(true);

        ButtonModel model = group.getSelection();
        System.out.println("Selected button model: " + model.getActionCommand());

        frame.setVisible(true);
    }
}
