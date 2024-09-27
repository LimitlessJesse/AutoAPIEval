import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

public class LayerUI_2 {
    public static void main(String[] args) {
        LayerUI layerUI = new LayerUI() {
            @Override
            public void uninstallUI(JComponent c) {
                // Reverses the configuration which was previously set
                // in the installUI(JComponent) method.
                // The default implementation unregisters the passed JLayer component
                // as a PropertyChangeListener for the property changes of this LayerUI.
            }
        };
    }
}
