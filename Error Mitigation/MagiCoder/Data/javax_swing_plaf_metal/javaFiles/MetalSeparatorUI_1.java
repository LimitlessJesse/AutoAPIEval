import javax.swing.*;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.*;

public class MetalSeparatorUI_1 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();
        metalSeparatorUI.paint(new JComponent() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                metalSeparatorUI.paint(g, this);
            }
        }.getGraphics(), separator);
    }
}
