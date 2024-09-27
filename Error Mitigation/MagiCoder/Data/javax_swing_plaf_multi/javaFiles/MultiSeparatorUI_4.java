import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        MultiSeparatorUI multiSeparatorUI = new MultiSeparatorUI();
        Dimension preferredSize = multiSeparatorUI.getPreferredSize(component);

        System.out.println("Preferred size: " + preferredSize);
    }
}
