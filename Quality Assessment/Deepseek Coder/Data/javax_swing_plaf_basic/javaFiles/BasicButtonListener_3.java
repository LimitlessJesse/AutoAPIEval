import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.plaf.basic.BasicButtonListener;

public class BasicButtonListener_3 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
