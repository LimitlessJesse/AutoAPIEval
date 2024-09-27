import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGroup_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonGroup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton button1 = new JRadioButton("Button 1");
        JRadioButton button2 = new JRadioButton("Button 2");
        JRadioButton button3 = new JRadioButton("Button 3");

        button1.setActionCommand("Button 1");
        button2.setActionCommand("Button 2");
        button3.setActionCommand("Button 3");

        buttonGroup.add(button1);
        buttonGroup.add(button2);
        buttonGroup.add(button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 selected");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 selected");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 selected");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
