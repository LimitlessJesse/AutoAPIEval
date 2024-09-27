import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creating a GridLayout with 2 rows and 3 columns
        GridLayout gridLayout = new GridLayout(2, 3);
        frame.setLayout(gridLayout);
        
        // Set the horizontal gap between components to 10
        gridLayout.setHgap(10);
        
        // Adding buttons to the frame
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        
        frame.pack();
        frame.setVisible(true);
    }
}
