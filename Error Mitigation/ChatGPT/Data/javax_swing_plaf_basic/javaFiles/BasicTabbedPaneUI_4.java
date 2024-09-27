import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class BasicTabbedPaneUI_4 {
    public static void main(String[] args) {
        JTabbedPane pane = new JTabbedPane();
        BasicTabbedPaneUI ui = new BasicTabbedPaneUI();
        int x = 10;
        int y = 20;
        int tabIndex = ui.tabForCoordinate(pane, x, y);
        System.out.println("Tab index at point (" + x + ", " + y + "): " + tabIndex);
    }
}
