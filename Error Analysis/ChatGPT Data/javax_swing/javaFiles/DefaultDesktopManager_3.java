import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;

public class DefaultDesktopManager_3 {
    
    public static void main(String[] args) {
        // Create a JInternalFrame object
        JInternalFrame frame = new JInternalFrame();
        
        // Call the iconifyFrame method
        DefaultDesktopManager manager = new DefaultDesktopManager();
        manager.iconifyFrame(frame);
    }
}
