import javax.swing.*;
import javax.swing.plaf.multi.MultiInternalFrameUI;

public class MultiInternalFrameUI_21 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame();
        MultiInternalFrameUI multiUI = new MultiInternalFrameUI();
        multiUI.installUI(frame);
    }
}
