import javax.swing.JInternalFrame;
import javax.swing.DefaultDesktopManager;

public class DefaultDesktopManager_1 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        desktopManager.activateFrame(internalFrame);
    }
}
