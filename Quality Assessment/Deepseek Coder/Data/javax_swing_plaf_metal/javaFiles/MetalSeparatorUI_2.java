import javax.swing.*;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.*;

public class MetalSeparatorUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            private MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();

            @Override
            protected void paintComponent(Graphics g) {
                metalSeparatorUI.paint(g, this, getBounds());
            }
        };

        Dimension preferredSize = component.getPreferredSize(component);
        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
