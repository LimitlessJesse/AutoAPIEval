import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class BasicInternalFrameUI_5 {
    public static void main(String[] args) {
        BasicInternalFrameUI internalFrameUI = new BasicInternalFrameUI(null);
        JComponent component = new JComponent() {}; // create a sample component
        
        internalFrameUI.setNorthPane(component);
    }
}
