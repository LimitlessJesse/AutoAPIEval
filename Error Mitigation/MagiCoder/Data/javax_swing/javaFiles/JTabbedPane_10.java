import javax.swing.*;
import java.awt.*;

public class JTabbedPane_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        // Set a custom component for the second tab
        JLabel customLabel = new JLabel("Custom Label");
        tabbedPane.setTabComponentAt(1, customLabel);

        frame.getContentPane().add(tabbedPane);
        frame.setVisible(true);
    }
}
