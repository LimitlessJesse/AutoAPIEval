import javax.swing.plaf.LayerUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class LayerUI_3 {
    public static void main(String[] args) {
        LayerUI layerUI = new LayerUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                // Subclasses should override this method and use
                // the specified Graphics object to render the content of the component.
                // The default implementation paints the passed component as is.
            }
        };
    }
}
