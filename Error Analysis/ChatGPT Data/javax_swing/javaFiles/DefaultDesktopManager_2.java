import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_2 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame");
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        desktopManager.closeFrame(internalFrame);
    }
}
