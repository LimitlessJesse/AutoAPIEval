import javax.swing.plaf.synth.SynthTableUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthTableUI_4 {
    public static void main(String[] args) {
        SynthTableUI ui = new SynthTableUI();
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ui.paint(g, this);
            }
        };
    }
}
