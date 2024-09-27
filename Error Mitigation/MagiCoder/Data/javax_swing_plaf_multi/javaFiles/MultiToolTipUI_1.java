import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public MultiToolTipUI getUI() {
                return new MultiToolTipUI() {
                    @Override
                    public void installUI(JComponent c) {
                        super.installUI(c);
                        // Your custom code here
                    }
                };
            }
        };

        component.getUI().installUI(component);
    }
}
