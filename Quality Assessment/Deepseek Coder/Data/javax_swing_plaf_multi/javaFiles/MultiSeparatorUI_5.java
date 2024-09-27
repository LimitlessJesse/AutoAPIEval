import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        // Get the UI of the separator
        MultiSeparatorUI separatorUI = (MultiSeparatorUI) button1.getUI().getAccessibleChild(0);

        // Create a Graphics object
        Graphics g = frame.getGraphics();

        // Call the update method
        separatorUI.update(g, button1);
    }
}
