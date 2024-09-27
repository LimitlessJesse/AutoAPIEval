import javax.swing.*;
import javax.swing.plaf.metal.MetalToolTipUI;
import java.awt.*;

public class MetalToolTipUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalToolTipUI ui = new MetalToolTipUI();
                ui.paint(g, this);
            }
        };
    }
}
