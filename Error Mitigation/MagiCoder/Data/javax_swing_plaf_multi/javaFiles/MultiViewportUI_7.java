import javax.swing.*;
import javax.swing.plaf.multi.MultiViewportUI;

public class MultiViewportUI_7 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiViewportUI multiViewportUI = new MultiViewportUI();
        multiViewportUI.uninstallUI(component);
    }
}
