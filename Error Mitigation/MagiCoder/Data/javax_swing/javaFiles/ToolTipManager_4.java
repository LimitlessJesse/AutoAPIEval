import javax.swing.ToolTipManager;

public class ToolTipManager_4 {
    public static void main(String[] args) {
        int dismissDelay = ToolTipManager.sharedInstance().getDismissDelay();
        System.out.println("Dismiss Delay: " + dismissDelay);
    }
}
