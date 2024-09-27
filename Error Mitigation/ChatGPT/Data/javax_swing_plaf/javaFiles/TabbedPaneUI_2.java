import javax.swing.*;
import javax.swing.plaf.TabbedPaneUI;

public class TabbedPaneUI_2 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        TabbedPaneUI tabbedPaneUI = tabbedPane.getUI();
        int tabRunCount = tabbedPaneUI.getTabRunCount(tabbedPane);
        System.out.println("Tab Run Count: " + tabRunCount);
    }
}
