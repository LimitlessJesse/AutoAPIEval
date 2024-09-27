import javax.swing.*;
import javax.swing.event.PopupMenuListener;

public class JComboBox_22 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");

        comboBox.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                System.out.println("Popup menu will become visible");
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                System.out.println("Popup menu will become invisible");
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                System.out.println("Popup menu canceled");
            }
        });

        comboBox.removePopupMenuListener(comboBox.getPopupMenuListeners()[0]);
    }
}
