import javax.swing.*;
import javax.swing.plaf.LayerUI;

public class LayerUI_1 {
    public static void main(String[] args) {
        JLayer<JPanel> layer = new JLayer<>(new JPanel());
        LayerUI<JPanel> layerUI = new LayerUI<>() {
            @Override
            public void installUI(JComponent c) {
                super.installUI(c);
                // Your custom code here
            }
        };
        layer.setLayerUI(layerUI);
    }
}
