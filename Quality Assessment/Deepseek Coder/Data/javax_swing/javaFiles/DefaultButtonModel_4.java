import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.Action;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JButton button = new JButton("Click me");
                DefaultButtonModel model = (DefaultButtonModel) button.getModel();
                boolean isPressed = model.isPressed();
                System.out.println("Button is pressed: " + isPressed);
            }
        });
    }
}
