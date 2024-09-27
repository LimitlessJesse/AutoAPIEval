import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import java.beans.PropertyVetoException;

public class JInternalFrame_19 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Title", true, true, true, true);
        frame.setSize(300, 200);
        frame.setVisible(true);

        JFrame parent = new JFrame();
        parent.setSize(400, 300);
        parent.setVisible(true);

        parent.add(frame);

        try {
            frame.setSelected(true);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }
}
