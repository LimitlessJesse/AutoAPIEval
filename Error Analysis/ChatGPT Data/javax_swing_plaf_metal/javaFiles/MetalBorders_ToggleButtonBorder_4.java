import javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder;
import javax.swing.*;
import java.awt.*;

public class MetalBorders_ToggleButtonBorder_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.setBorder(new ToggleButtonBorder());
        
        JFrame frame = new JFrame();
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
