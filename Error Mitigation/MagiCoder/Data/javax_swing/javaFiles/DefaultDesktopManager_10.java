import javax.swing.*;

public class DefaultDesktopManager_10 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame();
        DefaultDesktopManager manager = new DefaultDesktopManager();
        manager.activateFrame(frame);
    }
}
