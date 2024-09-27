import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_1 {
    public static void main(String[] args) {
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        
        desktopManager.activateFrame(internalFrame);
    }
}
