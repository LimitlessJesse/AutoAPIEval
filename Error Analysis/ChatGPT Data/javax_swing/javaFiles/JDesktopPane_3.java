import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class JDesktopPane_3 {
    public static void main(String[] args) {
        JDesktopPane desktopPane = new JDesktopPane();

        // Create a JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame");
        desktopPane.add(internalFrame);

        // Remove the JInternalFrame from JDesktopPane
        desktopPane.remove(internalFrame);
    }
}
