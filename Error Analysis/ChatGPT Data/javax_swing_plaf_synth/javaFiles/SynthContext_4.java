import javax.swing.*;
import javax.swing.plaf.synth.SynthContext;

public class SynthContext_4 {
    public static void main(String[] args) {
        SynthContext context = new SynthContext();
        JComponent component = context.getComponent();
        System.out.println("Component: " + component);
    }
}
