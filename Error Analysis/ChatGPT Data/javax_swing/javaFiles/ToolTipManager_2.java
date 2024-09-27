import javax.swing.ToolTipManager;

public class ToolTipManager_2 {
    public static void main(String[] args) {
        ToolTipManager manager = ToolTipManager.sharedInstance();
        int dismissDelay = manager.getDismissDelay();
        System.out.println("Default dismiss delay: " + dismissDelay);
    }
}
