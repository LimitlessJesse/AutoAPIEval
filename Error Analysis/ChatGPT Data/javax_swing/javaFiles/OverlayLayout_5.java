import javax.swing.*;
import java.awt.*;

public class OverlayLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OverlayLayout Example");
        JPanel panel = new JPanel();
        OverlayLayout overlayLayout = new OverlayLayout(panel);
        panel.setLayout(overlayLayout);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
