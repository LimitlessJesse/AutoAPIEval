import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

public class LayerUI_1 {
    public static void main(String[] args) {
        LayerUI<JComponent> layerUI = new LayerUI<JComponent>() {
            @Override
            public void installUI(JComponent c) {
                // Your implementation of installUI method goes here
                // Configure the JLayer this LayerUI is set to
                // Register the passed JLayer component as a PropertyChangeListener
            }
        };
    }
}
