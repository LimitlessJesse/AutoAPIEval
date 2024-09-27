import javax.swing.plaf.multi.MultiColorChooserUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiColorChooserUI_5 {
    public static void main(String[] args) {
        MultiColorChooserUI multiColorChooserUI = new MultiColorChooserUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiColorChooserUI.update(graphics, component);
    }
}
