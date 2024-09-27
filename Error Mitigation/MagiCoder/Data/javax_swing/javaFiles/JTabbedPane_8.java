import javax.swing.*;

public class JTabbedPane_8 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.setIconAt(0, new ImageIcon("path_to_your_icon.png"));
    }
}
