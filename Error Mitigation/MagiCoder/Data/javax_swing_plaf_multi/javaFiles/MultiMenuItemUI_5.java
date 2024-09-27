import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuItemUI;

public class MultiMenuItemUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                if (UIManager.get("MultiMenuItemUI")!= null) {
                    setUI((MultiMenuItemUI) UIManager.getUI(this));
                } else {
                    setUI(new MultiMenuItemUI());
                }
            }
        };

        component.updateUI();
        MultiMenuItemUI ui = (MultiMenuItemUI) component.getUI();
        ui.installUI(component);
    }
}
