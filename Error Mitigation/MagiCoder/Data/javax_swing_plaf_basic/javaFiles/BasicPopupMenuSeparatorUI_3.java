import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.awt.*;

public class BasicPopupMenuSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        ComponentUI ui = new BasicPopupMenuSeparatorUI();
        Dimension preferredSize = ui.getPreferredSize(component);

        System.out.println("Preferred size: " + preferredSize);
    }
}
