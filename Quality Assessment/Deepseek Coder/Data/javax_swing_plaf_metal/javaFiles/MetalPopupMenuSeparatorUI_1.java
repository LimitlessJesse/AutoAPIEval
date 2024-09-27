import javax.swing.*;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetalPopupMenuSeparatorUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setUI(new MetalPopupMenuSeparatorUI());

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = new JMenuItem("New Item");
                popupMenu.add(menuItem);
                popupMenu.show(button, 0, button.getHeight());
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
