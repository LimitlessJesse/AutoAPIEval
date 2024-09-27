import javax.swing.ToolTipManager;

public class ToolTipManager_3 {
    public static void main(String[] args) {
        ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
        toolTipManager.setLightWeightPopupEnabled(true);
    }
}
