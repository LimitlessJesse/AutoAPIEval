import javax.swing.plaf.synth.SynthSplitPaneUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class SynthSplitPaneUI_5 {
    public static void main(String[] args) {
        SynthSplitPaneUI ui = new SynthSplitPaneUI();
        JComponent component = new JComponent() {};
        Graphics graphics = component.getGraphics();
        
        ui.paint(graphics, component);
    }
}
