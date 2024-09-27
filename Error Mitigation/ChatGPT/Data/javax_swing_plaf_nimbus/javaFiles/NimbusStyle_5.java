import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.nimbus.NimbusStyle;
import java.awt.Insets;

public class NimbusStyle_5 {
    public static void main(String[] args) {
        NimbusStyle nimbusStyle = new NimbusStyle();
        SynthContext context = new SynthContext(null, null, null, null, 0);
        Insets insets = new Insets(0, 0, 0, 0);
        
        nimbusStyle.getInsets(context, insets);
        
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
