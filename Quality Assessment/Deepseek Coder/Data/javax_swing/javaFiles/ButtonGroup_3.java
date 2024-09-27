import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGroup_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonGroup Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(50, 50, 50, 50));

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Option 1");
        JRadioButton rb2 = new JRadioButton("Option 2");
        JRadioButton rb3 = new JRadioButton("Option 3");

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 selected");
            }
        });

        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 selected");
            }
        });

        rb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 3 selected");
            }
        });

        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
