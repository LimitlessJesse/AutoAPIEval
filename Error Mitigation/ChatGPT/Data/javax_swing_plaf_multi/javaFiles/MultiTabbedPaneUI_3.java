import javax.swing.JTabbedPane;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        MultiTabbedPaneUI multiTabbedPaneUI = new MultiTabbedPaneUI();
        
        int tab = multiTabbedPaneUI.tabForCoordinate(tabbedPane, 100, 50);
        System.out.println("Tab index for coordinates (100, 50): " + tab);
    }
}
