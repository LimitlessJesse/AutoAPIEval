import javax.swing.plaf.multi.MultiTreeUI;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MultiTreeUI_5 {
    public static void main(String[] args) {
        MultiTreeUI multiTreeUI = new MultiTreeUI();
        Graphics graphics = null; // provide a Graphics context
        JComponent component = new JComponent(); // provide a JComponent
        multiTreeUI.update(graphics, component);
    }
}
