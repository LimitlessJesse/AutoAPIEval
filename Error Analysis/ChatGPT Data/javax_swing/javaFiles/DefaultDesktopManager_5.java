import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_5 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Test Frame", true, true, true, true);
        
        DefaultDesktopManager desktopManager = new DefaultDesktopManager();
        desktopManager.maximizeFrame(frame);
    }
}
