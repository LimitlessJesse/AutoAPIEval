import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;
import java.awt.*;

public class MultiLabelUI_1 {
    public static void main(String[] args) {
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent component = new JLabel("Hello World");
        Dimension preferredSize = multiLabelUI.getPreferredSize(component);
        System.out.println("Preferred size: " + preferredSize);
    }
}
