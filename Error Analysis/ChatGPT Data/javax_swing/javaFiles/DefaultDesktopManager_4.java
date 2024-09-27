import javax.swing.JInternalFrame;
import javax.swing.DefaultDesktopManager;

public class DefaultDesktopManager_4 {
    
    public static void deiconifyFrame(JInternalFrame f) {
        DefaultDesktopManager manager = new DefaultDesktopManager();
        manager.deiconifyFrame(f);
    }
    
    public static void main(String[] args) {
        // Example of using deiconifyFrame method
        JInternalFrame frame = new JInternalFrame("Example Frame", true, true, true, true);
        frame.setSize(200, 200);
        frame.setVisible(true);
        
        // Deiconify the frame
        deiconifyFrame(frame);
    }
}
