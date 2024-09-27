import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayout_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        Container target = panel;
        BoxLayout boxLayout = (BoxLayout) layout;
        Dimension preferredSize = boxLayout.preferredLayoutSize(target);

        System.out.println("Preferred Layout Size: " + preferredSize);
    }
}
