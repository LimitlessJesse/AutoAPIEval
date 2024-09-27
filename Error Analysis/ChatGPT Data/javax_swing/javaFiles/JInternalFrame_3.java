import javax.swing.JInternalFrame;

public class JInternalFrame_3 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setResizable(false); // This method sets the resizable property of the internal frame
        internalFrame.setVisible(true);
    }
}
