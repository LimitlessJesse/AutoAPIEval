import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SynthOptionPaneUI_3 {
    public static void main(String[] args) {
        SynthOptionPaneUI ui = new SynthOptionPaneUI();
        JComponent component = new JComponent() {};
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
