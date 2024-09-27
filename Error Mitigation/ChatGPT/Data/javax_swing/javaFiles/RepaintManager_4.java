import javax.swing.JComponent;
import javax.swing.RepaintManager;

public class RepaintManager_4 {
    public static void main(String[] args) {
        RepaintManager repaintManager = new RepaintManager();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        repaintManager.addInvalidComponent(component);
    }
}
