import javax.swing.JTabbedPane;

public class JTabbedPane_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Adding tabs to the tabbed pane
        tabbedPane.addTab("Tab 1", new JLabel("Content 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content 2"));
        tabbedPane.addTab("Tab 3", new JLabel("Content 3"));
        
        // Removing a tab at index 1
        tabbedPane.removeTabAt(1);
    }
}
