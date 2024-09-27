import javax.swing.*;
import java.awt.*;

public class OverlayLayout_2 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new OverlayLayout(null));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        panel.revalidate();
        panel.repaint();

        panel.removeLayoutComponent(button1);

        panel.revalidate();
        panel.repaint();
    }
}
