import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayout_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1, 2));
        frame.setHgap(10);

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        frame.add(label1);
        frame.add(label2);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
