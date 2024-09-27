import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPane_9 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("JTabbedPane Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JTabbedPane tabbedPane = new JTabbedPane();
                tabbedPane.add("Tab 1", new JPanel());
                tabbedPane.add("Tab 2", new JPanel());
                tabbedPane.add("Tab 3", new JPanel());

                // Set the selected index to 1
                tabbedPane.setSelectedIndex(1);

                frame.getContentPane().add(tabbedPane);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
