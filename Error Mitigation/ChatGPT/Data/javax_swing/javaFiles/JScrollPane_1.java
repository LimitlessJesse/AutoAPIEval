import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Component;

public class JScrollPane_1 {
    public static void main(String[] args) {
        // Create a JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        
        // Create a component to be added to the scroll pane
        JPanel panel = new JPanel();
        panel.add(new javax.swing.JButton("Button 1"));
        panel.add(new javax.swing.JButton("Button 2"));
        
        // Set the component as the view for the scroll pane
        scrollPane.setViewportView(panel);
        
        // Create a JFrame to display the scroll pane
        JFrame frame = new JFrame();
        frame.add(scrollPane);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
