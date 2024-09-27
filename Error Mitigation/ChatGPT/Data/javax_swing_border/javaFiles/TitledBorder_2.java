import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class TitledBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TitledBorder Example");
        JPanel panel = new JPanel();
        
        TitledBorder border = BorderFactory.createTitledBorder("Title");
        panel.setBorder(border);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Set the title of the titled border
        border.setTitle("New Title");
    }
}
