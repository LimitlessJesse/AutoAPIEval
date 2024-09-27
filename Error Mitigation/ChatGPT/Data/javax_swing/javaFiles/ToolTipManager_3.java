import javax.swing.ToolTipManager;

public class ToolTipManager_3 {
    public static void main(String[] args) {
        ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
        toolTipManager.setDismissDelay(5000); // Set dismissal delay to 5 seconds
    }
}
