import javax.swing.*;
import java.awt.*;

public class BasicDesktopIconUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        ComponentUI ui = new BasicDesktopIconUI();
        Dimension preferredSize = ui.getPreferredSize(component);

        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
