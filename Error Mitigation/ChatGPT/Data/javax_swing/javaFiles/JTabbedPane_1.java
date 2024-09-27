import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;

public class JTabbedPane_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JPanel panel1 = new JPanel();
        panel1.add(new JButton("Button 1"));
        
        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Button 2"));
        
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        
        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
