import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderFactory_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Border border = BorderFactory.createBevelBorder(1); // 1 is for raised bevel
        panel.setBorder(border);

        frame.add(panel);
        frame.setVisible(true);
    }
}
