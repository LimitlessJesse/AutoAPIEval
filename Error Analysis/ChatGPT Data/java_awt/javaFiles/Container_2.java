import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Container_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Container Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.add(button1);
        frame.add(button2);
        System.out.println("Components before removal:");
        for (Component c : frame.getContentPane().getComponents()) {
            System.out.println(c);
        }

        frame.getContentPane().remove(button1);

        System.out.println("Components after removal:");
        for (Component c : frame.getContentPane().getComponents()) {
            System.out.println(c);
        }

        frame.setVisible(true);
    }
}
