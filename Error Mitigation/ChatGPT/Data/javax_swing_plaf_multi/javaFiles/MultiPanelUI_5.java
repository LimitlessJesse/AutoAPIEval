import javax.swing.plaf.multi.MultiPanelUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiPanelUI_5 {
    public static void main(String[] args) {
        MultiPanelUI multiPanelUI = new MultiPanelUI();
        Graphics graphics = null; // create a Graphics context
        JComponent component = new JComponent(); // create a JComponent
        multiPanelUI.paint(graphics, component);
    }
}
