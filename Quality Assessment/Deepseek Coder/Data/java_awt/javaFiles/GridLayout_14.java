import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GridLayout layout = new GridLayout(3, 3);
        frame.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        layout.addLayoutComponent("Button 1", button1);
        layout.addLayoutComponent("Button 2", button2);
        layout.addLayoutComponent("Button 3", button3);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
