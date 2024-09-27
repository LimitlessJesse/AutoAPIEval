import javax.swing.plaf.metal.MetalBorders;
import javax.swing.*;
import java.awt.*;

public class MetalBorders_TableHeaderBorder_1 {
    public static void main(String[] args) {
        // Create a JFrame to display the border
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom component for testing the border
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color of the border
                g.setColor(Color.RED);
                // Call the paintBorder method with parameters
                MetalBorders.TableHeaderBorder border = new MetalBorders.TableHeaderBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        // Add the custom component to the frame
        frame.add(component);
        frame.setVisible(true);
    }
}
