import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthInternalFrameUI;

public class SynthInternalFrameUI_3 {
    public static void main(String[] args) {
        SynthInternalFrameUI ui = new SynthInternalFrameUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
