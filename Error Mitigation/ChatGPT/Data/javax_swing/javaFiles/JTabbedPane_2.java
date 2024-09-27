import javax.swing.*;

public class JTabbedPane_2 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Tab 1 Content"));
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Tab 2 Content"));
        
        tabbedPane.insertTab("Tab 1", null, panel1, "Tooltip for Tab 1", 0);
        tabbedPane.insertTab("Tab 2", null, panel2, "Tooltip for Tab 2", 1);
        
        JFrame frame = new JFrame();
        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
