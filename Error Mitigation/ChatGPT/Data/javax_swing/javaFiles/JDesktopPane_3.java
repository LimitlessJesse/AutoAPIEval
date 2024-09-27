import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class JDesktopPane_3 {
    public static void main(String[] args) {
        JDesktopPane desktopPane = new JDesktopPane();
        
        // Add some internal frames to the desktop pane
        
        JInternalFrame[] frames = desktopPane.getAllFrames();
        
        for (JInternalFrame frame : frames) {
            System.out.println(frame.getTitle());
        }
    }
}
