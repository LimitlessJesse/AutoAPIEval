import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
    }
}
