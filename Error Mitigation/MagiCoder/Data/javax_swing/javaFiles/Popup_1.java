import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 100, 40);
        frame.add(button);

        JPopupMenu popup = new JPopupMenu();
        JButton popupButton = new JButton("Popup Button");
        popup.add(popupButton);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                popup.show(button, 0, button.getHeight());
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
