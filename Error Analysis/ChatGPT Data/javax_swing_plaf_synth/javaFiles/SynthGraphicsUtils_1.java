import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthGraphicsUtils;

public class SynthGraphicsUtils_1 {
    public static void main(String[] args) {
        SynthGraphicsUtils synthGraphicsUtils = new SynthGraphicsUtils();
        SynthContext context = new SynthContext(null, null, null, null, 0);
        Object paint = new Object(); // Assuming a valid paint object
        int x1 = 10;
        int y1 = 10;
        int x2 = 50;
        int y2 = 50;

        synthGraphicsUtils.drawLine(context, paint, null, x1, y1, x2, y2);
    }
}
