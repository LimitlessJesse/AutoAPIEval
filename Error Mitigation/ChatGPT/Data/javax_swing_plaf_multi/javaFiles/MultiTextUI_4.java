import javax.swing.plaf.multi.MultiTextUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiTextUI_4 {
    public static void main(String[] args) {
        MultiTextUI multiTextUI = new MultiTextUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiTextUI.update(graphics, component);
    }
}
