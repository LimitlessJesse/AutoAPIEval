import javax.swing.plaf.multi.MultiLabelUI;
import javax.swing.JComponent;
import java.awt.Dimension;

public class MultiLabelUI_5 {
    public static void main(String[] args) {
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension minimumSize = multiLabelUI.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
