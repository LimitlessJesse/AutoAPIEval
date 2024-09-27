import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.FlowLayout;

public class JSeparator_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);

        JSeparator separator = new JSeparator();
        separator.setOrientation(JSeparator.VERTICAL);

        frame.add(separator);
        frame.setVisible(true);
    }
}
