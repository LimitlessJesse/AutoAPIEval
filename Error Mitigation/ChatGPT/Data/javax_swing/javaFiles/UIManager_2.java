import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.LookAndFeel;

public class UIManager_2 {
    public static void main(String[] args) {
        try {
            LookAndFeel newLookAndFeel = new LookAndFeel(); // Instantiate a new LookAndFeel object
            UIManager.setLookAndFeel(newLookAndFeel); // Set the look and feel to the new LookAndFeel object
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
