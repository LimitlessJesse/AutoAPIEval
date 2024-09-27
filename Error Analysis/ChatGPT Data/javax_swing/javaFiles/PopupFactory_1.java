import javax.swing.*;

public class PopupFactory_1 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Popup example");
        PopupFactory popupFactory = PopupFactory.getSharedInstance();
        Popup popup = popupFactory.getPopup(null, label, 100, 100);
        popup.show();
    }
}
