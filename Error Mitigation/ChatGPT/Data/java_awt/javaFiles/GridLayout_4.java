import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a GridLayout with 2 rows and 2 columns
        GridLayout gridLayout = new GridLayout(2, 2);
        frame.setLayout(gridLayout);
        
        // Set the vertical gap between components to 10
        gridLayout.setVgap(10);
        
        // Add buttons to the frame
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        
        frame.pack();
        frame.setVisible(true);
    }
}
