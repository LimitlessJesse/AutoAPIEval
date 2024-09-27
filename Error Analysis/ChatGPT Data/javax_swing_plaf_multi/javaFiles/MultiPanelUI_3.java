import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiPanelUI;

public class MultiPanelUI_3 {
    public static void main(String[] args) {
        MultiPanelUI multiPanelUI = new MultiPanelUI();
        JComponent component = new JComponent() {
        };
        
        multiPanelUI.installUI(component);
    }
}
