import javax.swing.JButton;
import javax.swing.DefaultButtonModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultButtonModel_51 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setActionCommand("myCommand");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                System.out.println("Action command: " + command);
            }
        });
    }
}
