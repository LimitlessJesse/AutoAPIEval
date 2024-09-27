import javax.swing.ToolTipManager;

public class ToolTipManager_6 {
    public static void main(String[] args) {
        int initialDelay = ToolTipManager.sharedInstance().getInitialDelay();
        System.out.println("Initial delay for tool tip: " + initialDelay + " milliseconds");
    }
}
