import javax.swing.JInternalFrame;

public class JInternalFrame_1 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame("Resizable Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setResizable(true);
        internalFrame.setVisible(true);
    }
}
