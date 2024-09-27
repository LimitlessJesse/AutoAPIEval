import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SynthOptionPaneUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // custom implementation of JComponent
        };
        
        SynthOptionPaneUI ui = new SynthOptionPaneUI();
        ComponentUI createdUI = ui.createUI(component);
        
        // make use of the createdUI
    }
}
