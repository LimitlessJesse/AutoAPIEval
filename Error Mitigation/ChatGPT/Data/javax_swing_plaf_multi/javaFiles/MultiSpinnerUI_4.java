import javax.swing.plaf.multi.MultiSpinnerUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiSpinnerUI_4 {
    public static void main(String[] args) {
        MultiSpinnerUI multiSpinnerUI = new MultiSpinnerUI();
        Graphics graphics = null; // create a Graphics context
        JComponent component = new JComponent(); // create a JComponent
        multiSpinnerUI.update(graphics, component);
    }
}
