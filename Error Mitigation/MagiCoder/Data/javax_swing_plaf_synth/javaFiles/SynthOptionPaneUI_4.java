import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;

public class SynthOptionPaneUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Your custom painting code here
            }
        };

        SynthOptionPaneUI ui = new SynthOptionPaneUI();
        ui.update(component.getGraphics(), component);
    }
}
