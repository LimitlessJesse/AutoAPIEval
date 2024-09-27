import javax.swing.plaf.multi.MultiLabelUI;
import javax.swing.JComponent;
import java.awt.Dimension;

public class MultiLabelUI_4 {
    public static void main(String[] args) {
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = multiLabelUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
