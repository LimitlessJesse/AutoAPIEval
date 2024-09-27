import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class BasicInternalFrameUI_4 {
    public static void main(String[] args) {
        BasicInternalFrameUI internalFrameUI = new BasicInternalFrameUI(null);
        JComponent component = new JComponent() {
        };
        internalFrameUI.setWestPane(component);
    }
}
