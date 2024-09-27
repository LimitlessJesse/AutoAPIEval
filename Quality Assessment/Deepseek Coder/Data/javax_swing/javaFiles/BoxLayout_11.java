import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayout_11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        BoxLayout boxLayout = (BoxLayout) panel.getLayout();
        Container target = panel;
        Dimension minSize = boxLayout.minimumLayoutSize(target);

        System.out.println("Minimum Layout Width: " + minSize.width);
        System.out.println("Minimum Layout Height: " + minSize.height);
    }
}
