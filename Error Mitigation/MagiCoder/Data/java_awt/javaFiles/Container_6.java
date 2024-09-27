import java.awt.Container;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Container_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0, 1));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        contentPane.add(button1);
        contentPane.add(button2);

        frame.setSize(300, 200);
        frame.setVisible(true);

        Component component = contentPane.getComponent(0);
        System.out.println(component.getName());  // Output: Button 1

        component = contentPane.getComponent(1);
        System.out.println(component.getName());  // Output: Button 2
    }
}
