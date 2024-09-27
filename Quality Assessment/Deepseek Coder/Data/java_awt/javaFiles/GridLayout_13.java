import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        GridLayout layout = new GridLayout(3, 2); // 3 rows, 2 columns
        contentPane.setLayout(layout);

        for (int i = 1; i <= 6; i++) {
            contentPane.add(new JButton("Button " + i));
        }

        frame.pack();
        frame.setVisible(true);

        layout.layoutContainer(contentPane);
    }
}
