import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventQueue_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setVisible(true);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                button.dispatchEvent(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
            }
        });
    }
}
