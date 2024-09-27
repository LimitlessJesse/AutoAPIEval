import javax.swing.JPopupMenu;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPopupMenu_5 {
    public static void main(String[] args) {
        JPopupMenu popup = new JPopupMenu();
        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popup.show(button, 0, button.getHeight());
            }
        });
        popup.add(new JButton("Option 1"));
        popup.add(new JButton("Option 2"));
        popup.setInvoker(button);
    }
}
