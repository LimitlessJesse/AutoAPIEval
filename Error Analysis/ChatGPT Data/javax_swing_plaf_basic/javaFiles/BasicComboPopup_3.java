import javax.swing.plaf.basic.BasicComboPopup;

public class BasicComboPopup_3 {
    public static void main(String[] args) {
        BasicComboPopup comboPopup = new BasicComboPopup(null);
        int height = comboPopup.getPopupHeightForRowCount(5);
        System.out.println("Popup height for 5 rows: " + height);
    }
}
