import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.addTab("Tab 3", null);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

        int tabCount = tabbedPane.getTabCount();
        System.out.println("Number of tabs: " + tabCount);
    }
}
