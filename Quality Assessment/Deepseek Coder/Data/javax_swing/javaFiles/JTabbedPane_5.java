import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class JTabbedPane_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JLabel label1 = new JLabel("Tab 1");
        JLabel label2 = new JLabel("Tab 2");
        JLabel label3 = new JLabel("Tab 3");

        tabbedPane.addTab("Tab 1", label1);
        tabbedPane.addTab("Tab 2", label2);
        tabbedPane.addTab("Tab 3", label3);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

        // Get the component at index 1
        JComponent component = tabbedPane.getTabComponentAt(1);
        if (component!= null) {
            System.out.println("Component at index 1: " + component.getName());
        } else {
            System.out.println("No component at index 1");
        }
    }
}
