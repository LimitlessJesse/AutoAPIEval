import javax.swing.ToolTipManager;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ToolTipManager_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ToolTip Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("This is a tooltip example");
        label.setToolTipText("This is a tooltip");

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);

        ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
        toolTipManager.setInitialDelay(1000); // Set the initial delay to 1000 milliseconds
    }
}
