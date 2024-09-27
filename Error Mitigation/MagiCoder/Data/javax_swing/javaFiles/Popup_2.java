import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        frame.add(button);

        JPopupMenu popup = new JPopupMenu();
        JButton buttonInPopup = new JButton("Button in popup");
        popup.add(buttonInPopup);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popup.show(button, 0, button.getHeight());
            }
        });

        buttonInPopup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popup.hide();
            }
        });

        frame.setVisible(true);
    }
}
