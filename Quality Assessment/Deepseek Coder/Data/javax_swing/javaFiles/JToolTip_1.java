import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolTip;
import java.awt.Dimension;

public class JToolTip_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Hover me");
        button.setToolTipText("This is a tooltip");

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
