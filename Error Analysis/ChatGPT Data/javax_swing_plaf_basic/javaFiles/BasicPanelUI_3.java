import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPanelUI;

public class BasicPanelUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // implementation of JComponent
        };
        
        BasicPanelUI basicPanelUI = new BasicPanelUI();
        basicPanelUI.installUI(component);
    }
}
