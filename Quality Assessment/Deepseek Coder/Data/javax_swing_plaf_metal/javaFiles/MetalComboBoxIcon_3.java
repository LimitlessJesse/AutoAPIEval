import javax.swing.plaf.metal.MetalComboBoxIcon;
import javax.swing.JComboBox;

public class MetalComboBoxIcon_3 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        MetalComboBoxIcon icon = (MetalComboBoxIcon) comboBox.getEditor().getEditorComponent().getIcon();
        int iconHeight = icon.getIconHeight();
        System.out.println("Icon Height: " + iconHeight);
    }
}
