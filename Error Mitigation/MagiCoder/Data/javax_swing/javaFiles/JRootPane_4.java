import javax.swing.JFrame;
import javax.swing.JRootPane;

public class JRootPane_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JRootPane rootPane = frame.getRootPane();
        rootPane.setWindowDecorationStyle(JRootPane.FRAME);
    }
}
