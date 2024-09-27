import javax.swing.ToolTipManager;

public class ToolTipManager_4 {
    public static void main(String[] args) {
        boolean isLightWeightPopupEnabled = ToolTipManager.sharedInstance().isLightWeightPopupEnabled();
        System.out.println("Is Lightweight Popup Enabled: " + isLightWeightPopupEnabled);
    }
}
