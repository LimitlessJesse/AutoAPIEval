import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayout_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(300, 200);

        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Set vertical gap
        GridLayout layout = (GridLayout) frame.getLayout();
        layout.setVgap(10);

        frame.setVisible(true);
    }
}
