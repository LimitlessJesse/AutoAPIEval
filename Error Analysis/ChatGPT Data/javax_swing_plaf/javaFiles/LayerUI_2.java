import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

public class LayerUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};

        LayerUI<JComponent> layerUI = new LayerUI<JComponent>() {
            @Override
            public void uninstallUI(JComponent c) {
                super.uninstallUI(c);
                // Additional code to uninstall the UI for the specified component
            }
        };

        layerUI.uninstallUI(component);
    }
}
