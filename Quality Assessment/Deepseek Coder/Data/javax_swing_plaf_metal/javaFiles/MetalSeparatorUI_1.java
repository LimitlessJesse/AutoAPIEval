import javax.swing.*;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.*;

public class MetalSeparatorUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Separator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel(new GridLayout(0, 1));

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        panel.add(label1);
        panel.add(new JSeparator());
        panel.add(label2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
