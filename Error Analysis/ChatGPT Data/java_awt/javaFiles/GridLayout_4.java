import java.awt.GridLayout;
import javax.swing.JFrame;

public class GridLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(3, 2));
        frame.setVgap(10); // Set vertical gap between components to 10 pixels
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
