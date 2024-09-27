import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_3 {
    public static void main(String[] args) {
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame");
        
        // De-iconify the internal frame
        desktopManager.deiconifyFrame(internalFrame);
    }
}
