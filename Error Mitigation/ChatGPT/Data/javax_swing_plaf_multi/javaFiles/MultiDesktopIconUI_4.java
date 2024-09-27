import javax.swing.plaf.multi.MultiDesktopIconUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiDesktopIconUI_4 {
    public static void main(String[] args) {
        MultiDesktopIconUI multiDesktopIconUI = new MultiDesktopIconUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiDesktopIconUI.update(graphics, component);
    }
}
