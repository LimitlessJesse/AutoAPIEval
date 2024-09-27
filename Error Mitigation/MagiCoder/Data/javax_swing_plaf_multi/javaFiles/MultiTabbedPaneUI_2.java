import javax.swing.*;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_2 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content 2"));

        MultiTabbedPaneUI multiTabbedPaneUI = new MultiTabbedPaneUI();
        multiTabbedPaneUI.installUI(tabbedPane);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }
}
