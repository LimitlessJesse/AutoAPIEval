import javax.swing.*;
import javax.swing.plaf.TabbedPaneUI;

public class TabbedPaneUI_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        TabbedPaneUI tabbedPaneUI = tabbedPane.getUI();
        int x = 10;
        int y = 20;
        int tab = tabbedPaneUI.tabForCoordinate(tabbedPane, x, y);
        System.out.println("Tab index for coordinates (" + x + ", " + y + "): " + tab);
    }
}
