import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class JFrame_19 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}
