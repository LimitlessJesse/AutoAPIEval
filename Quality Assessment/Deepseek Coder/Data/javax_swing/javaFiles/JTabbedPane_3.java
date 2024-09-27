import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class JTabbedPane_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JLabel label1 = new JLabel("Content of Tab 1");
        JLabel label2 = new JLabel("Content of Tab 2");
        JLabel label3 = new JLabel("Content of Tab 3");

        tabbedPane.addTab("Tab 1", label1);
        tabbedPane.addTab("Tab 2", label2);
        tabbedPane.addTab("Tab 3", label3);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

        // Remove the tab at index 1
        tabbedPane.removeTabAt(1);
    }
}
