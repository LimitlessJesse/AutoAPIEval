import javax.swing.JComponent;
import javax.swing.RepaintManager;

public class RepaintManager_1 {
    public static void main(String[] args) {
        RepaintManager repaintManager = new RepaintManager();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        int x = 0;
        int y = 0;
        int w = 100;
        int h = 50;
        
        repaintManager.addDirtyRegion(component, x, y, w, h);
    }
}
