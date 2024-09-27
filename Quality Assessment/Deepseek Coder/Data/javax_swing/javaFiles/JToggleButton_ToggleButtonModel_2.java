import javax.swing.JToggleButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JToggleButton_ToggleButtonModel_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JToggleButton button = new JToggleButton("Toggle");
                button.setModel(new JToggleButton.ToggleButtonModel());
                button.setSelected(true);
                button.getModel().setSelected(false);

                JFrame frame = new JFrame("JToggleButton Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
