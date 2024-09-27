import javax.swing.JLayer;
import javax.swing.JComponent;
import java.awt.AWTEvent;

public class JLayer_2 {
    public static void main(String[] args) {
        JLayer<JComponent> jLayer = new JLayer<>();
        jLayer.setLayerEventMask(AWTEvent.KEY_EVENT_MASK | AWTEvent.FOCUS_EVENT_MASK);
    }
}
