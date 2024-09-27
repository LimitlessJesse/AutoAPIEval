import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicComboPopup;

public class BasicComboPopup_4 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.showPopup();
        BasicComboPopup popup = (BasicComboPopup) comboBox.getEditor().getPopup();
        popup.hide();
    }
}
