import javax.swing.ToolTipManager;

public class ToolTipManager_2 {
    public static void main(String[] args) {
        ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
        int initialDelay = toolTipManager.getInitialDelay();
        System.out.println("Initial delay value: " + initialDelay + " milliseconds");
    }
}
