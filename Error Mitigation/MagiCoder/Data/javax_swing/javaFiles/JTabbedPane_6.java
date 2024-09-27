import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();

        // Adding tabs
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);

        // Printing the tabs
        System.out.println("Tabs: " + tabbedPane.getTabCount());

        // Removing all tabs
        tabbedPane.removeAll();

        // Printing the tabs after removing
        System.out.println("Tabs after removeAll: " + tabbedPane.getTabCount());

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
