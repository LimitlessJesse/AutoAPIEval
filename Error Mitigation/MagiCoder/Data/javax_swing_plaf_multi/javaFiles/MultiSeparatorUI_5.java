import javax.swing.*;
import javax.swing.plaf.multi.*;
import java.awt.*;

public class MultiSeparatorUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MultiSeparatorUI multiSeparatorUI = new MultiSeparatorUI();
                multiSeparatorUI.update(g, this);
            }
        };
        component.setSize(100, 100);
        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
