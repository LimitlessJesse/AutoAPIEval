import javax.swing.plaf.synth.SynthComboBoxUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthComboBoxUI_5 {
    public static void main(String[] args) {
        SynthComboBoxUI ui = new SynthComboBoxUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                // Notifies this UI delegate to repaint the specified component
                // This method paints the component background, then calls the paint(SynthContext,Graphics) method
                // In general, this method does not need to be overridden by subclasses
                // All Look and Feel rendering code should reside in the paint method
            }
        };
    }
}
