import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SynthSeparatorUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // Override paintComponent method to draw the component
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the component
            }
        };

        SynthSeparatorUI ui = new SynthSeparatorUI();
        ui.installUI(component);

        // Add the component to a frame
        JFrame frame = new JFrame();
        frame.getContentPane().add(component);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
