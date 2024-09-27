import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_2 {
    public static void main(String[] args) {
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame");
        
        // Add internalFrame to parent
        
        desktopManager.closeFrame(internalFrame);
    }
}
