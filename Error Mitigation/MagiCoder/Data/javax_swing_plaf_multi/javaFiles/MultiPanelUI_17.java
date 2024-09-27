import javax.swing.*;
import javax.swing.plaf.multi.MultiPanelUI;

public class MultiPanelUI_17 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                if (UIManager.get("MultiPanelUI")!= null) {
                    setUI((MultiPanelUI) UIManager.getUI(this));
                } else {
                    setUI(new MultiPanelUI());
                }
            }
        };

        component.updateUI();
        MultiPanelUI multiPanelUI = (MultiPanelUI) component.getUI();
        multiPanelUI.installUI(component);
    }
}
