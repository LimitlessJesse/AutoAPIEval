import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class BasicTabbedPaneUI_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        BasicTabbedPaneUI ui = new BasicTabbedPaneUI();
        Rectangle tabBounds = ui.getTabBounds(tabbedPane, 0);
        System.out.println("Tab bounds: " + tabBounds);
    }
}
