import javax.swing.*;
import javax.swing.plaf.multi.MultiInternalFrameUI;
import java.awt.*;

public class MultiInternalFrameUI_15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setVisible(true);

        MultiInternalFrameUI multiUI = new MultiInternalFrameUI();
        multiUI.paint(internalFrame.getGraphics(), internalFrame);
    }
}
