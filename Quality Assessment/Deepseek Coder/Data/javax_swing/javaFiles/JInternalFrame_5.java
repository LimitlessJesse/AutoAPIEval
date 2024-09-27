import javax.swing.JInternalFrame;

public class JInternalFrame_5 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Title", true, true, true, true);
        frame.setResizable(false); // Set the JInternalFrame to be non-resizable
        frame.setVisible(true);
    }
}
