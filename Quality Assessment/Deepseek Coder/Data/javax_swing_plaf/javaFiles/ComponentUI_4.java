import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

public class ComponentUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComponentUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        ComponentUI buttonUI = button.getUI();

        buttonUI.update(frame.getGraphics(), button);

        frame.setVisible(true);
    }
}
