import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class BorderUIResource_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 150, 50);
        button.setUI(new BorderUIResource.ButtonBorderUI());

        button.addActionListener(e -> {
            button.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
            button.getParent().repaint();
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
