import javax.swing.plaf.basic.BasicBorders;
import javax.swing.*;
import java.awt.*;

public class BasicBorders_FieldBorder_1 {
    public static void main(String[] args) {
        // Create a JFrame to add a component with border
        JFrame frame = new JFrame("FieldBorder Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a component with a field border
        JComponent component = new JComponent() {
            @Override
            protected void paintBorder(Graphics g) {
                super.paintBorder(g);
                BasicBorders.FieldBorder border = new BasicBorders.FieldBorder(Color.BLACK, Color.WHITE, Color.GRAY, Color.WHITE);
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };
        
        frame.add(component);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
