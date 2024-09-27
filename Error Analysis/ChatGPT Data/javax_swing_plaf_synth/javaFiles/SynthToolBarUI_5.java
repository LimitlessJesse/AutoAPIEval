import javax.swing.plaf.synth.SynthContext;
import java.awt.Graphics;
import javax.swing.plaf.synth.SynthToolBarUI;

public class SynthToolBarUI_5 {
    public static void main(String[] args) {
        // Example of how to use paintBorder method from SynthToolBarUI
        SynthToolBarUI synthToolBarUI = new SynthToolBarUI();
        SynthContext context = new SynthContext(null, null, null, SynthContext.DEFAULT);
        Graphics graphics = null; // initialize graphics as needed
        int x = 0;
        int y = 0;
        int w = 100; // specify width
        int h = 50; // specify height
        synthToolBarUI.paintBorder(context, graphics, x, y, w, h);
    }
}
