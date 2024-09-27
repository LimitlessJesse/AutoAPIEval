import javax.swing.JColorChooser;
import javax.swing.plaf.synth.SynthColorChooserUI;
import javax.swing.plaf.synth.SynthContext;

public class SynthColorChooserUI_3 {
    public static void main(String[] args) {
        SynthColorChooserUI ui = new SynthColorChooserUI();
        JColorChooser colorChooser = new JColorChooser();
        SynthContext context = ui.getContext(colorChooser);
        System.out.println(context.toString());
    }
}
