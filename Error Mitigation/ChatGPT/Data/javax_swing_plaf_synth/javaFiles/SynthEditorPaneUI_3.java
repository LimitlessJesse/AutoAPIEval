import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthEditorPaneUI;

public class SynthEditorPaneUI_3 {
    public static void main(String[] args) {
        SynthEditorPaneUI ui = new SynthEditorPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
