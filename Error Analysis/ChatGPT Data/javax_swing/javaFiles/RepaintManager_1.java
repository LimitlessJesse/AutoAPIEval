import javax.swing.JComponent;
import javax.swing.RepaintManager;

public class RepaintManager_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        int x = 10;
        int y = 20;
        int w = 100;
        int h = 50;
        RepaintManager repaintManager = RepaintManager.currentManager(component);
        repaintManager.addDirtyRegion(component, x, y, w, h);
    }
}
