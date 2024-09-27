import javax.swing.JTabbedPane;

public class JTabbedPane_7 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.addTab("Tab 3", null);

        tabbedPane.setEnabledAt(0, false); // Disable the first tab
        tabbedPane.setEnabledAt(1, true);  // Enable the second tab
        tabbedPane.setEnabledAt(2, false); // Disable the third tab
    }
}
