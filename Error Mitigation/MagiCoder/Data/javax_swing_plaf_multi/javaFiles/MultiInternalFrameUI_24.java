import javax.swing.JInternalFrame;
import javax.swing.plaf.multi.MultiInternalFrameUI;
import java.awt.Graphics;

public class MultiInternalFrameUI_24 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("My Frame", true, true, true, true);
        MultiInternalFrameUI ui = new MultiInternalFrameUI();
        ui.update(new Graphics(), frame);
    }
}
