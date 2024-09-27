import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(0, 2)); // 0 means as many rows as needed, 2 columns

        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.pack();
        frame.setVisible(true);
    }
}
