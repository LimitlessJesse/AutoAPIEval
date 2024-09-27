import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;

public class MultiLabelUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        multiLabelUI.installUI(component);
    }
}
