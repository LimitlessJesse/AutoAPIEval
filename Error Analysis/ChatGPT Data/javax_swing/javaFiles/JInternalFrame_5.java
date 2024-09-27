import javax.swing.JInternalFrame;

public class JInternalFrame_5 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);
        frame.setIconifiable(true);
        System.out.println("Iconifiable set to: " + frame.isIcon());
    }
}
