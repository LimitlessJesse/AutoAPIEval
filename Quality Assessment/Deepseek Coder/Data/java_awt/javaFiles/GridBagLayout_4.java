import java.awt.Container;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        Container contentPane = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        contentPane.setLayout(layout);

        JButton button = new JButton("Click me");
        contentPane.add(button);

        layout.layoutContainer(contentPane);

        frame.setVisible(true);
    }
}
