import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.Graphics;

public class SynthSeparatorUI_5 {
    public static void main(String[] args) {
        // Create a SynthSeparatorUI object
        SynthSeparatorUI ui = new SynthSeparatorUI();

        // Create a JComponent object
        JComponent component = new JComponent() {
            // Override the paintComponent method
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Call the update method
                ui.update(g, this);
            }
        };

        // Call the paint method
        component.paint(component.getGraphics());
    }
}
