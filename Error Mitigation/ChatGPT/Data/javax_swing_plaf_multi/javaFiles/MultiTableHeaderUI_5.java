import javax.swing.plaf.multi.MultiTableHeaderUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiTableHeaderUI_5 {
    public static void main(String[] args) {
        MultiTableHeaderUI multiTableHeaderUI = new MultiTableHeaderUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiTableHeaderUI.update(graphics, component);
    }
}
