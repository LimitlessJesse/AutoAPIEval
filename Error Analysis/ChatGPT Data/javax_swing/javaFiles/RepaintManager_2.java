import javax.swing.JComponent;
import javax.swing.RepaintManager;

public class RepaintManager_2 {
    public static void main(String[] args) {
        RepaintManager repaintManager = RepaintManager.currentManager(new JComponent());
        JComponent component = new JComponent();
        
        repaintManager.addInvalidComponent(component);
    }
}
