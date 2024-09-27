import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_5 {
    public static void main(String[] args) {
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        JInternalFrame frame = new JInternalFrame("Internal Frame");
        
        desktopManager.openFrame(frame);
    }
}
