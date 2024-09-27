import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Tab 1", null);
        tabbedPane.add("Tab 2", null);
        tabbedPane.add("Tab 3", null);

        tabbedPane.setTitleAt(0, "New Title 1");
        tabbedPane.setTitleAt(1, "New Title 2");
        tabbedPane.setTitleAt(2, "New Title 3");

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }
}
