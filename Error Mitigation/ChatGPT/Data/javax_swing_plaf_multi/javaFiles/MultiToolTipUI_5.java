import javax.swing.plaf.multi.MultiToolTipUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiToolTipUI_5 {
    public static void main(String[] args) {
        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiToolTipUI.update(graphics, component);
    }
}
