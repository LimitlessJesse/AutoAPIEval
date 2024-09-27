import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_8 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

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

        JButton button = new JButton("Show popup");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.showPopup();
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBox);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
