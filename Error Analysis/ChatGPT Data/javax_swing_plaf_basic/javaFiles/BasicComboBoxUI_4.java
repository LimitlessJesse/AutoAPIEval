import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicComboBoxUI_4 {
    public static void main(String[] args) {
        
    }
    
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        BasicComboBoxUI ui = new BasicComboBoxUI();
        ui.paintCurrentValueBackground(g, bounds, hasFocus);
    }
}
