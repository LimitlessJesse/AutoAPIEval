import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiLabelUI;

public class MultiLabelUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent accessibleChild = multiLabelUI.getAccessibleChild(component, 0);
        System.out.println("Accessible child: " + accessibleChild);
    }
}
