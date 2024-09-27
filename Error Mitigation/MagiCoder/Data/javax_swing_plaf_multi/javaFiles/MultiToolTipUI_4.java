import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;
import java.awt.*;

public class MultiToolTipUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        Dimension preferredSize = multiToolTipUI.getPreferredSize(component);

        System.out.println("Preferred size: " + preferredSize);
    }
}
