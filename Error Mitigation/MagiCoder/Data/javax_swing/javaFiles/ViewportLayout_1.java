import javax.swing.*;
import java.awt.*;

public class ViewportLayout_1 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(new ViewportLayout());

        JButton button = new JButton("Click me");
        panel.add(button);

        panel.revalidate();
        panel.repaint();
    }
}
