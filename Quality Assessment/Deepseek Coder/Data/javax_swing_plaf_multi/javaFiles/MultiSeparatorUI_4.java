import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };

        MultiSeparatorUI ui = new MultiSeparatorUI();
        Dimension preferredSize = ui.getPreferredSize(component);

        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
