import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.plaf.basic.BasicButtonListener;

public class BasicButtonListener_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the button");
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
