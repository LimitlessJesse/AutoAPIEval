import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Group Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        ButtonGroup bg = new ButtonGroup();

        JCheckBox checkbox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkbox2 = new JCheckBox("Checkbox 2");
        JCheckBox checkbox3 = new JCheckBox("Checkbox 3");

        bg.add(checkbox1);
        bg.add(checkbox2);
        bg.add(checkbox3);

        checkbox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Checkbox 1 selected");
            }
        });

        checkbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Checkbox 2 selected");
            }
        });

        checkbox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Checkbox 3 selected");
            }
        });

        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
