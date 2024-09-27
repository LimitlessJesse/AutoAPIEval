import javax.swing.JPopupMenu;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPopupMenu_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        frame.getContentPane().add(button);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");
        popupMenu.add("Option 3");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                popupMenu.setInvoker(button);
                popupMenu.show(button, 0, button.getHeight());
            }
        });

        frame.setVisible(true);
    }
}
