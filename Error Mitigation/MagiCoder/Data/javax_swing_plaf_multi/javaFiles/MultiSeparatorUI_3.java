import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(Box.createVerticalStrut(10));
        panel.add(button2);

        frame.getContentPane().add(panel);

        MultiSeparatorUI multiSeparatorUI = new MultiSeparatorUI();
        multiSeparatorUI.paint(panel.getGraphics(), panel);

        frame.setVisible(true);
    }
}
