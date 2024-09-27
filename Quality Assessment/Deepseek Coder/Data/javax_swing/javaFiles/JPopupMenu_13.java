import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPopupMenu_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPopupMenu popup = new JPopupMenu();
                popup.add("Option 1");
                popup.add("Option 2");
                popup.show(button, e.getX(), e.getY());

                System.out.println("Invoker: " + popup.getInvoker());
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
