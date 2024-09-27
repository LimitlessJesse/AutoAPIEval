import javax.swing.*;
import javax.swing.plaf.TabbedPaneUI;
import java.awt.*;

public class TabbedPaneUI_1 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        TabbedPaneUI tabbedPaneUI = tabbedPane.getUI();
        int index = 0;
        Rectangle tabBounds = tabbedPaneUI.getTabBounds(tabbedPane, index);
        System.out.println("Tab bounds: " + tabBounds);
    }
}
