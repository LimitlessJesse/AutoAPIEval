import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPopupMenu_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Menu Item");
        popupMenu.add(menuItem);
        
        JButton button = new JButton("Show Popup Menu");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                popupMenu.show(button, 0, button.getHeight());
            }
        });
        
        frame.add(button);
        frame.setVisible(true);
    }
}
