import javax.swing.plaf.metal.MetalBorders.ButtonBorder;
import javax.swing.*;
import java.awt.*;

public class MetalBorders_ButtonBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Click Here");
        ButtonBorder border = new ButtonBorder();
        border.paintBorder(button, button.getGraphics(), 10, 10, button.getWidth(), button.getHeight());
        
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
