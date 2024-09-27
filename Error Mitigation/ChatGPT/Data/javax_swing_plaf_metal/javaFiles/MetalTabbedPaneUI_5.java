import javax.swing.*;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.awt.*;

public class MetalTabbedPaneUI_5 {
    public static void main(String[] args) {
        MetalTabbedPaneUI metalUI = new MetalTabbedPaneUI();
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                metalUI.paint(g, this);
            }
        };
    }
}
