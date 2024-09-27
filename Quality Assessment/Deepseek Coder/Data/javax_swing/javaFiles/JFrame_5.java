import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Frame");
        JButton button = new JButton("Close");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
