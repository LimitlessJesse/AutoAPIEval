import javax.swing.plaf.multi.MultiTableUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiTableUI_4 {
    public static void main(String[] args) {
        MultiTableUI multiTableUI = new MultiTableUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiTableUI.update(graphics, component);
    }
}
