import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthDesktopIconUI;

public class SynthDesktopIconUI_5 {
    public static void main(String[] args) {
        SynthDesktopIconUI ui = new SynthDesktopIconUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        SynthContext context = ui.getContext(component);
        System.out.println(context.toString());
    }
}
