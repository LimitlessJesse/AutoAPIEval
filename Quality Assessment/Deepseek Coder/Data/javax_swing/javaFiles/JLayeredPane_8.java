import javax.swing.*;
import java.awt.*;

public class JLayeredPane_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.add(layeredPane);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        layeredPane.add(button1, new Integer(1), 0);
        layeredPane.add(button2, new Integer(2), 0);

        layeredPane.moveToFront(button1);

        frame.setVisible(true);
    }
}
