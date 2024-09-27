import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TitledBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Title Test");
        panel.add(label);
        
        TitledBorder titledBorder = new TitledBorder("Original Title");
        panel.setBorder(titledBorder);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        titledBorder.setTitle("New Title");
        panel.setBorder(titledBorder);
    }
}
