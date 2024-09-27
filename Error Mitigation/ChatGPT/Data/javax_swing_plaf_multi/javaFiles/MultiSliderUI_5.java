import javax.swing.plaf.multi.MultiSliderUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiSliderUI_5 {
    public static void main(String[] args) {
        MultiSliderUI multiSliderUI = new MultiSliderUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiSliderUI.update(graphics, component);
    }
}
