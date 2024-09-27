import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JInternalFrame_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        frame.add(internalFrame);
        internalFrame.setMaximizable(true);
        internalFrame.setVisible(true);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
