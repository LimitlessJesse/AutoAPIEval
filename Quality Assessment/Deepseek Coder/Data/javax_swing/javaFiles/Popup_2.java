import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Popup_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Popup Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);

                JButton button = new JButton("Click me");
                button.setBounds(100, 100, 100, 40);
                frame.add(button);
                frame.setLayout(null);
                frame.setVisible(true);

                JPopupMenu popupMenu = new JPopupMenu();
                popupMenu.add("Option 1");
                popupMenu.add("Option 2");
                popupMenu.add("Option 3");

                button.addActionListener(e -> {
                    popupMenu.show(button, 0, button.getHeight());
                });

                popupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        popupMenu.hide();
                    }
                });
            }
        });
    }
}
