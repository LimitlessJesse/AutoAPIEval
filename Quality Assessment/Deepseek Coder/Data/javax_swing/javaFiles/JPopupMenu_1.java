import javax.swing.*;
import java.awt.*;

public class JPopupMenu_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Option 1"));
        popupMenu.add(new JMenuItem("Option 2"));
        popupMenu.add(new JMenuItem("Option 3"));

        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popupMenu.show(frame, e.getX(), e.getY());
            }
        });

        frame.setVisible(true);
    }
}
