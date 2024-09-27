import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JLayeredPane_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLayeredPane layeredPane = new JLayeredPane();
        
        JButton button1 = new JButton("Button 1");
        layeredPane.add(button1);
        layeredPane.setLayer(button1, 0);
        
        JButton button2 = new JButton("Button 2");
        layeredPane.add(button2);
        layeredPane.setLayer(button2, 1);
        
        frame.add(layeredPane);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
