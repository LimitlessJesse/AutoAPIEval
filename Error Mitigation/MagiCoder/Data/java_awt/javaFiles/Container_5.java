import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Container_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0, 1));

        for (int i = 0; i < 5; i++) {
            contentPane.add(new JLabel("Label " + i));
        }

        int count = contentPane.getComponentCount();
        System.out.println("Number of components: " + count);

        frame.pack();
        frame.setVisible(true);
    }
}
