import javax.swing.JInternalFrame;

public class JInternalFrame_4 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Old Title", true, true, true, true);
        frame.setTitle("New Title");
        System.out.println(frame.getTitle());
    }
}
