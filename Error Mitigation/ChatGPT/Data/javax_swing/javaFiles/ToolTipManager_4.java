import javax.swing.ToolTipManager;

public class ToolTipManager_4 {
    public static void main(String[] args) {
        ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
        int dismissDelay = toolTipManager.getDismissDelay();
        System.out.println("Dismiss delay value: " + dismissDelay + " milliseconds");
    }
}
