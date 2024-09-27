import javax.swing.plaf.basic.BasicBorders;
import javax.swing.JComponent;
import java.awt.Graphics;

public class BasicBorders_ToggleButtonBorder_2 {
    public static void main(String[] args) {
        // Create a JComponent
        JComponent component = new JComponent() {
            // Override the paintBorder method
            @Override
            public void paintBorder(Graphics g) {
                BasicBorders.ToggleButtonBorder border = new BasicBorders.ToggleButtonBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };
        
        // Call the paintBorder method
        component.paintBorder(null);
    }
}
