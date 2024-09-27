import javax.swing.JInternalFrame;
import javax.swing.DefaultDesktopManager;

public class DefaultDesktopManager_11 {
    public static void main(String[] args) {
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        JInternalFrame frame = new JInternalFrame();
        desktopManager.deactivateFrame(frame);
    }
}
