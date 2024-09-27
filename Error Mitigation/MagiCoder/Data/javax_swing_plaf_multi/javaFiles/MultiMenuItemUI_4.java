import javax.swing.*;
import javax.swing.plaf.multi.*;
import java.awt.*;

public class MultiMenuItemUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Your custom painting code here
            }
        };

        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        multiMenuItemUI.update(component.getGraphics(), component);
    }
}
