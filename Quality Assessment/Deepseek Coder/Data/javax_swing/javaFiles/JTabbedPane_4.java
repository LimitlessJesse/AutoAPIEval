import javax.swing.*;
import java.awt.*;

public class JTabbedPane_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("Panel 2"));

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        // Set a custom component for the first tab
        JLabel customLabel = new JLabel("Custom Label");
        tabbedPane.setTabComponentAt(0, customLabel);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }
}
