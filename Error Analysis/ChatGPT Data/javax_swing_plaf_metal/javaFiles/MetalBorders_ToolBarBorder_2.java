import javax.swing.plaf.metal.MetalBorders;
import javax.swing.*;
import java.awt.*;

public class MetalBorders_ToolBarBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalBorders.ToolBarBorder border = new MetalBorders.ToolBarBorder();
                border.paintBorder(this, g, 10, 10, getWidth() - 20, getHeight() - 20);
            }
        };
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
