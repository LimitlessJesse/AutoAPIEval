import javax.swing.AbstractAction;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbstractAction_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.setEnabled(true);

        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        };

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.setEnabled(false);
                System.out.println("Button disabled");
            }
        });
    }
}
