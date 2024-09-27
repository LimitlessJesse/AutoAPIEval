import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class BasicComboBoxRenderer_1 {
    public static void main(String[] args) {
        Object value = "Option 1";
        JList list = new JList();
        int index = 0;
        boolean isSelected = true;
        boolean cellHasFocus = true;

        BasicComboBoxRenderer renderer = new BasicComboBoxRenderer();
        renderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}
