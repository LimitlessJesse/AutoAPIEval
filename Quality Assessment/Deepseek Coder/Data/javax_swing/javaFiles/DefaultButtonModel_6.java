import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.Action;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JButton button = new JButton("Click me");
                DefaultButtonModel model = (DefaultButtonModel) button.getModel();
                boolean isRollover = model.isRollover();
                System.out.println("Is rollover: " + isRollover);
            }
        });
    }
}
