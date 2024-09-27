import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel);
        
        // Set up the scroll pane layout
        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        layout.layoutContainer(scrollPane);
        
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
