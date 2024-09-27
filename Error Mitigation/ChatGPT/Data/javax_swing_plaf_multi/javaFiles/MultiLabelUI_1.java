import javax.swing.plaf.multi.MultiLabelUI;
import javax.swing.JComponent;

public class MultiLabelUI_1 {
    public static void main(String[] args) {
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent component = new JComponent() {
        };
        multiLabelUI.installUI(component);
    }
}
