import javax.swing.*;
import javax.swing.plaf.multi.MultiDesktopPaneUI;

public class MultiDesktopPaneUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                if (UIManager.get("MultiDesktopPaneUI")!= null) {
                    setUI((MultiDesktopPaneUI) UIManager.getUI(this));
                } else {
                    setUI(new MultiDesktopPaneUI());
                }
            }
        };

        MultiDesktopPaneUI multiDesktopPaneUI = (MultiDesktopPaneUI) component.getUI();
        multiDesktopPaneUI.installUI(component);
    }
}
