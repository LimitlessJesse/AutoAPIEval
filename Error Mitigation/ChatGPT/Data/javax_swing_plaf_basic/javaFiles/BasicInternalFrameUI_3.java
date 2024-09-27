import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class BasicInternalFrameUI_3 {
    public static void main(String[] args) {
        BasicInternalFrameUI ui = new BasicInternalFrameUI(null);
        JComponent component = new JComponent() {
        };
        ui.setEastPane(component);
    }
}
