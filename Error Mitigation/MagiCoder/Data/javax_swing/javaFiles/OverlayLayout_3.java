import javax.swing.*;
import java.awt.*;

public class OverlayLayout_3 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(new OverlayLayout(panel));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        Dimension preferredSize = panel.getPreferredSize();
        System.out.println("Preferred Size: " + preferredSize);
    }
}
