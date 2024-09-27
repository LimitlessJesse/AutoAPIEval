import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthStyle;
import javax.swing.plaf.synth.ColorType;
import java.awt.Color;

public class SynthStyle_3 {
    public static void main(String[] args) {
        SynthContext context = new SynthContext();
        ColorType type = ColorType.FOREGROUND;
        
        SynthStyle style = new SynthStyle();
        Color color = style.getColor(context, type);
        
        System.out.println("Color: " + color);
    }
}
