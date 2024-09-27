import javax.swing.JTabbedPane;

public class JTabbedPane_13 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.addTab("Tab 3", null);

        tabbedPane.setToolTipTextAt(0, "Tooltip for Tab 1");
        tabbedPane.setToolTipTextAt(1, "Tooltip for Tab 2");
        tabbedPane.setToolTipTextAt(2, "Tooltip for Tab 3");
    }
}
