import javax.swing.*;
import javax.swing.plaf.multi.MultiInternalFrameUI;

public class MultiInternalFrameUI_22 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame();
        frame.getRootPane().setUI(new MultiInternalFrameUI());
        frame.getRootPane().getUI().uninstallUI(internalFrame);
    }
}
