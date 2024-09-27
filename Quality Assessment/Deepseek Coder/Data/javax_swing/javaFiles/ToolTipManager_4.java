import javax.swing.ToolTipManager;

public class ToolTipManager_4 {
    public static void main(String[] args) {
        boolean enabled = ToolTipManager.isLightweightPopupEnabled();
        System.out.println("Is Lightweight Popup Enabled? " + enabled);
    }
}
