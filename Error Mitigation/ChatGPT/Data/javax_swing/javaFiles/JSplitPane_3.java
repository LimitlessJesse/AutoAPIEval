import javax.swing.JSplitPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;

public class JSplitPane_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
        JButton button1 = new JButton("Button 1");
        panel1.add(button1);
        
        JPanel panel2 = new JPanel();
        JButton button2 = new JButton("Button 2");
        panel2.add(button2);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        splitPane.setDividerLocation(200);
        
        frame.add(splitPane);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // Using setLeftComponent method
        JPanel newPanel = new JPanel();
        JButton newButton = new JButton("New Button");
        newPanel.add(newButton);
        
        splitPane.setLeftComponent(newPanel);
    }
}
