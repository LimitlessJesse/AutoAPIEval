import javax.swing.*;
import javax.swing.plaf.multi.MultiRootPaneUI;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

public class MultiRootPaneUI_5 {
    
    public static void main(String[] args) {
        
    }

    public void update(Graphics g, JComponent c) {
        ComponentUI ui = MultiRootPaneUI.createUI(c);
        ui.update(g, c);
    }
}
