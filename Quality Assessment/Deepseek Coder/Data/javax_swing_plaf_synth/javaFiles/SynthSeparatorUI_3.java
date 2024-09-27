import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.*;

public class SynthSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // Override the paintComponent method to draw the separator
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.drawLine(0, 0, getWidth(), getHeight());
            }
        };

        SynthSeparatorUI ui = new SynthSeparatorUI();
        Dimension preferredSize = ui.getPreferredSize(component);

        System.out.println("Preferred width: " + preferredSize.width);
        System.out.println("Preferred height: " + preferredSize.height);
    }
}
