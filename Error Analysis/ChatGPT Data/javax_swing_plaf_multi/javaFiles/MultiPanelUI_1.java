import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiPanelUI;

public class MultiPanelUI_1 {
    
    public static void main(String[] args) {
        JComponent component = new JComponent() {
        };
        
        MultiPanelUI multiPanelUI = new MultiPanelUI();
        ComponentUI ui = multiPanelUI.createUI(component);
        
        System.out.println("Component UI created: " + ui.toString());
    }
}
