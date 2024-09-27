import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        frame.remove(button);
        frame.revalidate();
    }
}
