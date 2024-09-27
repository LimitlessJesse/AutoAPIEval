import javax.swing.*;
import java.awt.*;

public class OverlayLayout_4 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new OverlayLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));

        Dimension minSize = panel.getMinimumSize();
        System.out.println("Minimum Size: " + minSize);
    }
}
