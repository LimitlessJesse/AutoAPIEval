import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboPopup;

public class BasicComboPopup_2 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.showPopup();

        BasicComboPopup popup = (BasicComboPopup) comboBox.getEditor().getPopupMenu();
        popup.hide();

        JOptionPane.showMessageDialog(null, "Popup has been hidden");
    }
}
