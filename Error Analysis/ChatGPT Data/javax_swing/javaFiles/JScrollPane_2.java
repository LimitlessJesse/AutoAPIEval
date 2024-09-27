import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class JScrollPane_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Pane Example");
        JLabel label = new JLabel("This is a scroll pane example");
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(label);
        
        frame.add(scrollPane);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
